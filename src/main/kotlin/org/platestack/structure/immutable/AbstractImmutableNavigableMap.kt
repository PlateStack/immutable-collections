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

package org.platestack.structure.immutable

import java.io.Serializable
import java.util.*

internal abstract class AbstractImmutableNavigableMap<K, out V> : ImmutableNavigableMap<K, V>, Serializable {
    companion object {
        private const val serialVersionUID = 1L
    }

    protected open fun <K, V> NavigableMap<K, V>.build(): ImmutableNavigableMap<K, V> = toImmutableNavigableMap()

    override fun builder(): ImmutableNavigableMap.Builder<K, @UnsafeVariance V> = toMutable().let {
        object : NavigableMap<K, V> by it, ImmutableNavigableMap.Builder<K, V> {
            override fun build() = it.build()

            override fun equals(other: Any?) = other === this || it == other
            override fun hashCode() = it.hashCode()
            override fun toString() = it.toString()
        }
    }
}
