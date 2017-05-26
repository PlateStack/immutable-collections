/*
 *  Copyright (C) 2017 José Roberto de Araújo Júnior
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

/*
 *  Copyright (C) 2017 José Roberto de Araújo Júnior
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

import io.kotlintest.matchers.shouldBe
import io.kotlintest.specs.ShouldSpec
import org.platestack.structure.immutable.*

class Maps: ShouldSpec() {
    init {
        "immutable maps should equates to normal maps" {
            immutableMapOf<String, String>() shouldBe mapOf<String, String>()
            immutableMapOf("a" to "b") shouldBe mapOf("a" to "b")
            immutableMapOf("a" to "b", "b" to "c", "c" to "d") shouldBe mapOf("a" to "b", "b" to "c", "c" to "d")

            immutableHashMapOf<String, String>() shouldBe emptyMap<String, String>()
            immutableHashMapOf("a" to "b") shouldBe mapOf("a" to "b")
            immutableHashMapOf("a" to "b", "b" to "c", "c" to "d") shouldBe mapOf("a" to "b", "b" to "c", "c" to "d")

            immutableSortedMapOf("a" to "b", "b" to "a") shouldBe mapOf("a" to "b", "b" to "a")
            immutableSortedMapOf(reverseOrder(), "a" to "b", "b" to "a") shouldBe mapOf("a" to "b", "b" to "a")

            immutableNavigableMapOf("a" to "b", "b" to "a") shouldBe mapOf("a" to "b", "b" to "a")
            immutableNavigableMapOf(reverseOrder(), "a" to "b", "b" to "a") shouldBe mapOf("a" to "b", "b" to "a")
        }

        "immutable sets should equates to normal sets" {
            immutableSetOf<String>() shouldBe  setOf<String>()
            immutableSetOf("a") shouldBe setOf("a")
            immutableSetOf("a", "b", "c") shouldBe setOf("a", "b", "c")

            immutableHashSetOf<String>() shouldBe  setOf<String>()
            immutableHashSetOf("a") shouldBe setOf("a")
            immutableHashSetOf("a", "b", "c") shouldBe setOf("a", "b", "c")

            immutableSortedSetOf("a", "b", "c") shouldBe setOf("a", "b", "c")
            immutableSortedSetOf(reverseOrder(), "a", "b", "c") shouldBe setOf("a", "b", "c")

            immutableNavigableSetOf("a", "b", "c") shouldBe setOf("a", "b", "c")
            immutableNavigableSetOf(reverseOrder(), "a", "b", "c") shouldBe setOf("a", "b", "c")
        }

        "immutable lists should equates to normal sets" {
            immutableListOf<String>() shouldBe listOf<String>()
            immutableListOf("a") shouldBe listOf("a")
            immutableListOf("a", "b", "c") shouldBe listOf("a", "b", "c")
        }
    }
}
