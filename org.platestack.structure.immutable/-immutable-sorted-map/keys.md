[immutable-collections](../../index.md) / [org.platestack.structure.immutable](../index.md) / [ImmutableSortedMap](index.md) / [keys](.)

# keys

`abstract val keys: Set<K>` [(source)](https://github.com/PlateStack/immutable-collections/blob/v0.1.0-alpha/src/main/kotlin/org/platestack/structure/immutable/ImmutableSortedMap.kt#L183)

Returns a [Set](#) view of the keys contained in this map.
The set's iterator returns the keys in ascending order.
The set is backed by the map, so changes to the map are
reflected in the set, and vice-versa.  If the map is modified
while an iteration over the set is in progress (except through
the iterator's own `remove` operation), the results of
the iteration are undefined.  The set supports element removal,
which removes the corresponding mapping from the map, via the
`Iterator.remove`, `Set.remove`,
`removeAll`, `retainAll`, and `clear`
operations.  It does not support the `add` or `addAll`
operations.

**Return**
a set view of the keys contained in this map, sorted in
    ascending order

