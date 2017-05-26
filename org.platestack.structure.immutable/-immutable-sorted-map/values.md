[immutable-collections](../../index.md) / [org.platestack.structure.immutable](../index.md) / [ImmutableSortedMap](index.md) / [values](.)

# values

`abstract val values: Collection<V>` [(source)](https://github.com/PlateStack/immutable-collections/blob/v0.1.0-alpha/src/main/kotlin/org/platestack/structure/immutable/ImmutableSortedMap.kt#L203)

Returns a [Collection](#) view of the values contained in this map.
The collection's iterator returns the values in ascending order
of the corresponding keys.
The collection is backed by the map, so changes to the map are
reflected in the collection, and vice-versa.  If the map is
modified while an iteration over the collection is in progress
(except through the iterator's own `remove` operation),
the results of the iteration are undefined.  The collection
supports element removal, which removes the corresponding
mapping from the map, via the `Iterator.remove`,
`Collection.remove`, `removeAll`,
`retainAll` and `clear` operations.  It does not
support the `add` or `addAll` operations.

**Return**
a collection view of the values contained in this map,
    sorted in ascending key order

