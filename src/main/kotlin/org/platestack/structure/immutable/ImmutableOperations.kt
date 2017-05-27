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
@file:JvmName("ImmutableOperations")

package org.platestack.structure.immutable

import java.util.function.BiFunction
import java.util.function.Function
import java.util.function.Predicate

inline fun <E, reified C: ImmutableCollection<E>> C.mutate(mutation: ImmutableCollection.Builder<E>.() -> Unit) = builder().apply(mutation).build() as C
inline fun <E, reified C: ImmutableCollection<E>> C.addB(element: E) = mutate { add(element) }
inline fun <E, reified C: ImmutableCollection<E>> C.add(element: E) = mutate { add(element) }
inline fun <E, reified C: ImmutableCollection<E>> C.addAll(elements: Collection<E>) = mutate { addAll(elements) }
inline fun <E, reified C: ImmutableCollection<E>> C.addAll(elements: Iterable<E>) = mutate { addAll(elements) }
inline fun <E, reified C: ImmutableCollection<E>> C.addAll(elements: Sequence<E>) = mutate { addAll(elements) }
inline fun <E, reified C: ImmutableCollection<E>> C.addAll(elements: Array<E>) = mutate { addAll(elements) }
inline fun <E, reified C: ImmutableCollection<E>> C.remove(element: E) = mutate { remove(element) }
inline fun <E, reified C: ImmutableCollection<E>> C.removeIf(filter: Predicate<@UnsafeVariance E>) = mutate { removeIf(filter) }
inline fun <E, reified C: ImmutableCollection<E>> C.removeIf(noinline filter: (E) -> Boolean) = mutate { removeIf(filter) }
inline fun <E, reified C: ImmutableCollection<E>> C.removeAll(elements: Collection<E>) = mutate { removeAll(elements) }
inline fun <E, reified C: ImmutableCollection<E>> C.removeAll(elements: Iterable<E>) = mutate { removeAll(elements) }
inline fun <E, reified C: ImmutableCollection<E>> C.removeAll(elements: Sequence<E>) = mutate { removeAll(elements) }
inline fun <E, reified C: ImmutableCollection<E>> C.removeAll(elements: Array<E>) = mutate { removeAll(elements) }
inline fun <E, reified C: ImmutableCollection<E>> C.retainAll(elements: Collection<E>) = mutate { removeAll(elements) }
inline fun <E, reified C: ImmutableCollection<E>> C.retainAll(elements: Iterable<E>) = mutate { removeAll(elements) }
inline fun <E, reified C: ImmutableCollection<E>> C.retainAll(elements: Sequence<E>) = mutate { removeAll(elements) }
inline fun <E, reified C: ImmutableCollection<E>> C.retainAll(elements: Array<E>) = mutate { removeAll(elements) }
inline fun <E, reified C: ImmutableCollection<E>> C.clear() = mutate { clear() }

inline fun <K, V, reified M: ImmutableMap<K, V>> M.mutate(mutation: ImmutableMap.Builder<K, V>.() -> Unit) = builder().apply(mutation).build() as M
inline fun <K, V, reified M: ImmutableMap<K, V>> M.put(key: K, value: V) = mutate { put(key, value) }
inline fun <K, V, reified M: ImmutableMap<K, V>> M.putIfAbsent(key: K, value: V) = mutate { putIfAbsent(key, value) }
inline fun <K, V, reified M: ImmutableMap<K, V>> M.putAll(from: Map<K, V>) = mutate { putAll(from) }
inline fun <K, V, reified M: ImmutableMap<K, V>> M.putAll(pairs: Iterable<Pair<K, V>>) = mutate { putAll(pairs) }
inline fun <K, V, reified M: ImmutableMap<K, V>> M.putAll(pairs: Sequence<Pair<K, V>>) = mutate { putAll(pairs) }
inline fun <K, V, reified M: ImmutableMap<K, V>> M.putAll(pairs: Array<Pair<K, V>>) = mutate { putAll(pairs) }
inline fun <K, V, reified M: ImmutableMap<K, V>> M.remove(key: K) = mutate { remove(key) }
inline fun <K, V, reified M: ImmutableMap<K, V>> M.remove(key: K, value: V) = mutate { remove(key, value) }
inline fun <K, V, reified M: ImmutableMap<K, V>> M.clear() = mutate { clear() }
inline fun <K, V, reified M: ImmutableMap<K, V>> M.merge(key: K, value: V, remappingFunction: BiFunction<V, V, V?>) = mutate { merge(key, value, remappingFunction) }
inline fun <K, V, reified M: ImmutableMap<K, V>> M.merge(key: K, value: V, noinline remappingFunction: (V, V) -> V?) = mutate { merge(key, value, remappingFunction) }
inline fun <K, V, reified M: ImmutableMap<K, V>> M.compute(key: K, remappingFunction: BiFunction<K, V?, V?>) = mutate { compute(key, remappingFunction) }
inline fun <K, V, reified M: ImmutableMap<K, V>> M.compute(key: K, noinline remappingFunction: (K, V?) -> V?) = mutate { compute(key, remappingFunction) }
inline fun <K, V, reified M: ImmutableMap<K, V>> M.computeIfAbsent(key: K, remappingFunction: Function<in K, out V>) = mutate { computeIfAbsent(key, remappingFunction) }
inline fun <K, V, reified M: ImmutableMap<K, V>> M.computeIfAbsent(key: K, noinline remappingFunction: (K) -> V) = mutate { computeIfAbsent(key, remappingFunction) }
inline fun <K, V, reified M: ImmutableMap<K, V>> M.computeIfPresent(key: K, remappingFunction: BiFunction<in K, in V, out V>) = mutate { computeIfPresent(key, remappingFunction) }
inline fun <K, V, reified M: ImmutableMap<K, V>> M.computeIfPresent(key: K, noinline remappingFunction: (K, V) -> V) = mutate { computeIfPresent(key, remappingFunction) }
inline fun <K, V, reified M: ImmutableMap<K, V>> M.replace(key: K, value: V) = mutate { replace(key, value) }
inline fun <K, V, reified M: ImmutableMap<K, V>> M.replace(key: K, oldValue: V, value: V) = mutate { replace(key, oldValue, value) }
inline fun <K, V, reified M: ImmutableMap<K, V>> M.replaceAll(function: BiFunction<in K, in V, out V>) = mutate { replaceAll(function) }
inline fun <K, V, reified M: ImmutableMap<K, V>> M.replaceAll(noinline function: (K, V) -> V) = mutate { replaceAll(function) }
