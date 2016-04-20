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

package com.madscience.example.pojos;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.palantir.remoting.retrofit.OkHttpClientOptions;


/**
 * Example person object.
 */
public final class ExamplePerson {

    private final int age;
    private final String firstName;
    private final String gender;
    private final String lastName;
    private final OkHttpClientOptions options;

    @JsonCreator
    public ExamplePerson(
            @JsonProperty int age,
            @JsonProperty String firstName,
            @JsonProperty String gender,
            @JsonProperty String lastName) {
        this.age = age;
        this.firstName = firstName;
        this.gender = gender;
        this.lastName = lastName;
        this.options = new OkHttpClientOptions.Builder().build();
    }

    public int getAge() {
        return age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getGender() {
        return gender;
    }

    public String getLastName() {
        return lastName;
    }

    public OkHttpClientOptions options() {
        return this.options;
    }

}

