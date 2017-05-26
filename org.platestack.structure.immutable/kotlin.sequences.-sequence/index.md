[immutable-collections](../../index.md) / [org.platestack.structure.immutable](../index.md) / [kotlin.sequences.Sequence](.)

### Extensions for kotlin.sequences.Sequence

| Name | Summary |
|---|---|
| [toImmutableHashMap](to-immutable-hash-map.md) | `fun <K, V> Sequence<Pair<K, V>>.toImmutableHashMap(): `[`ImmutableMap`](../-immutable-map.md)`<K, V>`<br>Returns an immutable hash map containing all key-value pairs from the original sequence. |
| [toImmutableHashSet](to-immutable-hash-set.md) | `fun <E> Sequence<E>.toImmutableHashSet(): `[`ImmutableSet`](../-immutable-set.md)`<E>`<br>Returns an immutable hash set of all elements. The returned set is serializable. |
| [toImmutableList](to-immutable-list.md) | `fun <E> Sequence<E>.toImmutableList(): `[`ImmutableList`](../-immutable-list.md)`<E>`<br>Returns a list containing all the elements. The returned list is serializable. |
| [toImmutableMap](to-immutable-map.md) | `fun <K, V> Sequence<Pair<K, V>>.toImmutableMap(): `[`ImmutableMap`](../-immutable-map.md)`<K, V>`<br>Returns an immutable map containing all key-value pairs from the original sequence. |
| [toImmutableNavigableMap](to-immutable-navigable-map.md) | `fun <K, V> Sequence<Pair<K, V>>.toImmutableNavigableMap(comparator: `[`Comparator`](http://docs.oracle.com/javase/6/docs/api/java/util/Comparator.html)`<in K>? = null): `[`ImmutableNavigableMap`](../-immutable-navigable-map/index.md)`<K, V>`<br>Returns an immutable sorted map containing all key-value pairs from the original source. |
| [toImmutableNavigableSet](to-immutable-navigable-set.md) | `fun <E> Sequence<E>.toImmutableNavigableSet(comparator: `[`Comparator`](http://docs.oracle.com/javase/6/docs/api/java/util/Comparator.html)`<in E>? = null): `[`ImmutableNavigableSet`](../-immutable-navigable-set/index.md)`<E>`<br>Returns an immutable navigable set of all elements. The returned set is serializable. |
| [toImmutableSet](to-immutable-set.md) | `fun <E> Sequence<E>.toImmutableSet(): `[`ImmutableSet`](../-immutable-set.md)`<E>`<br>Returns a Set of all elements. The returned set is serializable. |
| [toImmutableSortedMap](to-immutable-sorted-map.md) | `fun <K, V> Sequence<Pair<K, V>>.toImmutableSortedMap(comparator: `[`Comparator`](http://docs.oracle.com/javase/6/docs/api/java/util/Comparator.html)`<in K>? = null): `[`ImmutableMap`](../-immutable-map.md)`<K, V>`<br>Returns an immutable sorted map containing all key-value pairs from the original source. |
| [toImmutableSortedSet](to-immutable-sorted-set.md) | `fun <E> Sequence<E>.toImmutableSortedSet(comparator: `[`Comparator`](http://docs.oracle.com/javase/6/docs/api/java/util/Comparator.html)`<in E>? = null): `[`ImmutableSortedSet`](../-immutable-sorted-set/index.md)`<E>`<br>Returns an immutable sorted set of all elements. The returned set is serializable. |
