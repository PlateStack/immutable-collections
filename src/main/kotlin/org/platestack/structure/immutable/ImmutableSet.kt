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

/**
 * A [Set] that strictly prohibits modifications after its creation.
 * @param E the type of elements contained in the list. The list is covariant on its element type.
 */
interface ImmutableSet<out E> : Set<E>, ImmutableCollection<E> {
    override fun toMutable(): MutableSet<@UnsafeVariance E> = toMutableSet()
    override fun builder(): Builder<@UnsafeVariance E>
    interface Builder<E>: MutableSet<E>, ImmutableCollection.Builder<E> {
        override fun build(): ImmutableSet<E>
    }

}
