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

import com.google.common.truth.Truth;
import com.madscience.example.pojos.ExamplePerson;
import org.assertj.core.api.Assertions;
import org.junit.Assert;
import org.junit.Test;

/**
 * Example tests using JUnit, Hamcrest, Truth, and AssertJ.
 */
public final class TestComparisons {

    @Test
    public void testAssertThat() {
        ExamplePerson expected = new ExamplePerson(10, "John", "Male", "Snow");
        ExamplePerson actual = new ExamplePerson(10, "John", "Male", "Snow");

        // assertJ
        Assertions.assertThat(actual).isEqualTo(expected);

        // junit
        Assert.assertEquals(expected, actual);

        // truth
        Truth.assertThat(actual).isEqualTo(expected);
    }
}
