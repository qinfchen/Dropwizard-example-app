/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package com.madscience.example;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.Optional;
import com.google.common.collect.ImmutableSet;
import com.madscience.example.ExampleApplication.ExampleConfig;
import com.palantir.indexpage.IndexPageBundle;
import com.palantir.indexpage.IndexPageConfigurable;
import com.palantir.websecurity.WebSecurityBundle;
import com.palantir.websecurity.WebSecurityConfigurable;
import com.palantir.websecurity.WebSecurityConfiguration;
import io.dropwizard.Application;
import io.dropwizard.Configuration;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

/**
 * Example application that consumes {@link IndexPageBundle}.
 */
public final class ExampleApplication extends Application<ExampleConfig> {

    public static void main(String[] args) throws Exception {
        new ExampleApplication().run(args);
    }

    @Override
    public void initialize(Bootstrap<ExampleConfig> bootstrap) {
        bootstrap.addBundle(new IndexPageBundle(ImmutableSet.of("/hello/*", "/goodbye/*", "/surprise/*")));
        bootstrap.addBundle(new WebSecurityBundle());
    }

    @Override
    public void run(ExampleConfig configuration, Environment environment) throws Exception {
        // intentionally left blank
    }

    static class ExampleConfig extends Configuration implements IndexPageConfigurable, WebSecurityConfigurable {

        private final String indexPagePath;

        @JsonCreator
        ExampleConfig(
                @JsonProperty("indexPagePath") Optional<String> indexPagePath) {
            this.indexPagePath = indexPagePath.or("./assets/index.html");
        }

        @Override
        public String getIndexPagePath() {
            return this.indexPagePath;
        }

        @Override
        public WebSecurityConfiguration getWebSecurityConfiguration() {
            return WebSecurityConfiguration.builder().contentSecurityPolicy("").build();
        }
    }
}

