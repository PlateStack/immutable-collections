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
 * A [map][Map] which strict that strictly prohibits modifications after its creation.
 *
 * @param K the type of map keys. The map is invariant on its key type, as it
 *          can accept key as a parameter (of [containsKey] for example) and return it in [keys] set.
 * @param V the type of map values. The map is covariant on its value type.
 */
interface ImmutableMap<K, out V>: Map<K, V>
