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

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.immutables.value.Value.Immutable;
import org.immutables.value.Value.Style;

/**
 * Example person object.
 */
@Immutable
@Style(allParameters = true)
@JsonSerialize(as = ImmutableExamplePerson.class)
@JsonDeserialize(as = ImmutableExamplePerson.class)
public abstract class ExamplePerson {

    public abstract int getAge();

    public abstract String getFirstName();

    public abstract String getGender();

    public abstract String getLastName();
}
