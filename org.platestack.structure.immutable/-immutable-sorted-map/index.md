[immutable-collections](../../index.md) / [org.platestack.structure.immutable](../index.md) / [ImmutableSortedMap](.)

# ImmutableSortedMap

`interface ImmutableSortedMap<K, out V> : `[`ImmutableMap`](../-immutable-map.md)`<K, V>`

An interface that mimics the original [SortedMap](http://docs.oracle.com/javase/6/docs/api/java/util/SortedMap.html) but without exposing modification functions to Kotlin source codes.

Modifications are strictly forbidden after the map is created.

### Parameters

`K` - the type of map keys. The map is invariant on its key type, as it
    can accept key as a parameter (of [containsKey](#) for example) and return it in [keys](keys.md) set.

`V` - the type of map values. The map is covariant on its value type.

### Properties

| Name | Summary |
|---|---|
| [entries](entries.md) | `abstract val entries: Set<Entry<K, V>>`<br>Returns a [Set](#) view of the mappings contained in this map.
The set's iterator returns the entries in ascending key order.
The set is backed by the map, so changes to the map are
reflected in the set, and vice-versa.  If the map is modified
while an iteration over the set is in progress (except through
the iterator's own `remove` operation, or through the
`setValue` operation on a map entry returned by the
iterator) the results of the iteration are undefined.  The set
supports element removal, which removes the corresponding
mapping from the map, via the `Iterator.remove`,
`Set.remove`, `removeAll`, `retainAll` and
`clear` operations.  It does not support the
`add` or `addAll` operations. |
| [keys](keys.md) | `abstract val keys: Set<K>`<br>Returns a [Set](#) view of the keys contained in this map.
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
operations. |
| [values](values.md) | `abstract val values: Collection<V>`<br>Returns a [Collection](#) view of the values contained in this map.
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
support the `add` or `addAll` operations. |

### Functions

| Name | Summary |
|---|---|
| [comparator](comparator.md) | `abstract fun comparator(): `[`Comparator`](http://docs.oracle.com/javase/6/docs/api/java/util/Comparator.html)`<in K>?`<br>Returns the comparator used to order the keys in this map, or
`null` if this map uses the [natural ordering](#) of its keys. |
| [firstKey](first-key.md) | `abstract fun firstKey(): K`<br>Returns the first (lowest) key currently in this map. |
| [head](head.md) | `abstract fun head(toKey: K): ImmutableSortedMap<K, V>`<br>Returns a view of the portion of this map whose keys are
strictly less than `toKey`.  The returned map is backed
by this map, so changes in the returned map are reflected in
this map, and vice-versa.  The returned map supports all
optional map operations that this map supports. |
| [lastKey](last-key.md) | `abstract fun lastKey(): K`<br>Returns the last (highest) key currently in this map. |
| [sub](sub.md) | `abstract fun sub(fromKey: K, toKey: K): ImmutableSortedMap<K, V>`<br>Returns a view of the portion of this map whose keys range from
`fromKey`, inclusive, to `toKey`, exclusive.  (If
`fromKey` and `toKey` are equal, the returned map
is empty.)  The returned map is backed by this map, so changes
in the returned map are reflected in this map, and vice-versa.
The returned map supports all optional map operations that this
map supports. |
| [tail](tail.md) | `abstract fun tail(fromKey: K): ImmutableSortedMap<K, V>`<br>Returns a view of the portion of this map whose keys are
greater than or equal to `fromKey`.  The returned map is
backed by this map, so changes in the returned map are
reflected in this map, and vice-versa.  The returned map
supports all optional map operations that this map supports. |

### Extension Functions

| Name | Summary |
|---|---|
| [toImmutableHashMap](../kotlin.collections.-map/to-immutable-hash-map.md) | `fun <K, V> Map<K, V>.toImmutableHashMap(): `[`ImmutableMap`](../-immutable-map.md)`<K, V>`<br>Returns an immutable hash map containing all key-value pairs from the original map. |
| [toImmutableMap](../kotlin.collections.-map/to-immutable-map.md) | `fun <K, V> Map<K, V>.toImmutableMap(): `[`ImmutableMap`](../-immutable-map.md)`<K, V>`<br>Returns an immutable map containing all key-value pairs from the original map. |
| [toImmutableNavigableMap](../kotlin.collections.-map/to-immutable-navigable-map.md) | `fun <K, V> Map<K, V>.toImmutableNavigableMap(): `[`ImmutableNavigableMap`](../-immutable-navigable-map/index.md)`<K, V>`<br>Returns an immutable sorted map containing all key-value pairs from the original map. |
| [toImmutableSortedMap](../kotlin.collections.-map/to-immutable-sorted-map.md) | `fun <K, V> Map<K, V>.toImmutableSortedMap(comparator: `[`Comparator`](http://docs.oracle.com/javase/6/docs/api/java/util/Comparator.html)`<in K>?): ImmutableSortedMap<K, V>`<br>Returns an immutable sorted map containing all key-value pairs from the original map. |

### Inheritors

| Name | Summary |
|---|---|
| [ImmutableNavigableMap](../-immutable-navigable-map/index.md) | `interface ImmutableNavigableMap<K, out V> : ImmutableSortedMap<K, V>`<br>An interface that mimics the original [NavigableMap](http://docs.oracle.com/javase/6/docs/api/java/util/NavigableMap.html) but without exposing modification functions to Kotlin source codes. |
