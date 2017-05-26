[immutable-collections](../../index.md) / [org.platestack.structure.immutable](../index.md) / [ImmutableNavigableMap](index.md) / [navigableKeys](.)

# navigableKeys

`abstract val navigableKeys: `[`ImmutableNavigableSet`](../-immutable-navigable-set/index.md)`<K>`

Returns a [NavigableSet](http://docs.oracle.com/javase/6/docs/api/java/util/NavigableSet.html) view of the keys contained in this map.
The set's iterator returns the keys in ascending order.
The set is backed by the map, so changes to the map are reflected in
the set, and vice-versa.  If the map is modified while an iteration
over the set is in progress (except through the iterator's own `remove` operation), the results of the iteration are undefined.  The
set supports element removal, which removes the corresponding mapping
from the map, via the `Iterator.remove`, `Set.remove`,
`removeAll`, `retainAll`, and `clear` operations.
It does not support the `add` or `addAll` operations.

**Return**
a navigable set view of the keys in this map

