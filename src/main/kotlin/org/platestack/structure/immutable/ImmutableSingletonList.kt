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

internal class ImmutableSingletonList<out E>(element: E, private val base: List<E> = Collections.singletonList(element)):
        AbstractImmutableList<E>(),
        List<E> by base,
        Serializable { companion object { private const val serialVersionUID = 1L }

    override fun equals(other: Any?) = other === this || base == other
    override fun hashCode() = base.hashCode()
    override fun toString() = base.toString()
}
