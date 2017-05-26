[immutable-collections](../../index.md) / [org.platestack.structure.immutable](../index.md) / [ImmutableNavigableMap](.)

# ImmutableNavigableMap

`interface ImmutableNavigableMap<K, out V> : `[`ImmutableSortedMap`](../-immutable-sorted-map/index.md)`<K, V>`

An interface that mimics the original [NavigableMap](http://docs.oracle.com/javase/6/docs/api/java/util/NavigableMap.html) but without exposing modification functions to Kotlin source codes.

Modifications are strictly forbidden after the map is created.

### Parameters

`K` - the type of map keys. The map is invariant on its key type, as it
    can accept key as a parameter (of [containsKey](#) for example) and return it in [keys](../-immutable-sorted-map/keys.md) set.

`V` - the type of map values. The map is covariant on its value type.

### Properties

| Name | Summary |
|---|---|
| [descending](descending.md) | `abstract val descending: ImmutableNavigableMap<K, V>`<br>Returns a reverse order view of the mappings contained in this map.
The descending map is backed by this map, so changes to the map are
reflected in the descending map, and vice-versa.  If either map is
modified while an iteration over a collection view of either map
is in progress (except through the iterator's own `remove`
operation), the results of the iteration are undefined. |
| [descendingKeys](descending-keys.md) | `abstract val descendingKeys: `[`ImmutableNavigableSet`](../-immutable-navigable-set/index.md)`<K>`<br>Returns a reverse order [NavigableSet](http://docs.oracle.com/javase/6/docs/api/java/util/NavigableSet.html) view of the keys contained in this map.
The set's iterator returns the keys in descending order.
The set is backed by the map, so changes to the map are reflected in
the set, and vice-versa.  If the map is modified while an iteration
over the set is in progress (except through the iterator's own `remove` operation), the results of the iteration are undefined.  The
set supports element removal, which removes the corresponding mapping
from the map, via the `Iterator.remove`, `Set.remove`,
`removeAll`, `retainAll`, and `clear` operations.
It does not support the `add` or `addAll` operations. |
| [navigableKeys](navigable-keys.md) | `abstract val navigableKeys: `[`ImmutableNavigableSet`](../-immutable-navigable-set/index.md)`<K>`<br>Returns a [NavigableSet](http://docs.oracle.com/javase/6/docs/api/java/util/NavigableSet.html) view of the keys contained in this map.
The set's iterator returns the keys in ascending order.
The set is backed by the map, so changes to the map are reflected in
the set, and vice-versa.  If the map is modified while an iteration
over the set is in progress (except through the iterator's own `remove` operation), the results of the iteration are undefined.  The
set supports element removal, which removes the corresponding mapping
from the map, via the `Iterator.remove`, `Set.remove`,
`removeAll`, `retainAll`, and `clear` operations.
It does not support the `add` or `addAll` operations. |

### Inherited Properties

| Name | Summary |
|---|---|
| [entries](../-immutable-sorted-map/entries.md) | `abstract val entries: Set<Entry<K, V>>`<br>Returns a [Set](#) view of the mappings contained in this map.
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
| [keys](../-immutable-sorted-map/keys.md) | `abstract val keys: Set<K>`<br>Returns a [Set](#) view of the keys contained in this map.
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
| [values](../-immutable-sorted-map/values.md) | `abstract val values: Collection<V>`<br>Returns a [Collection](#) view of the values contained in this map.
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
| [ceilingEntry](ceiling-entry.md) | `abstract fun ceilingEntry(key: K): Entry<K, V>?`<br>Returns a key-value mapping associated with the least key
greater than or equal to the given key, or `null` if
there is no such key. |
| [ceilingKey](ceiling-key.md) | `abstract fun ceilingKey(key: K): K?`<br>Returns the least key greater than or equal to the given key,
or `null` if there is no such key. |
| [firstEntry](first-entry.md) | `abstract fun firstEntry(): Entry<K, V>?`<br>Returns a key-value mapping associated with the least
key in this map, or `null` if the map is empty. |
| [floorEntry](floor-entry.md) | `abstract fun floorEntry(key: K): Entry<K, V>?`<br>Returns a key-value mapping associated with the greatest key
less than or equal to the given key, or `null` if there
is no such key. |
| [floorKey](floor-key.md) | `abstract fun floorKey(key: K): K?`<br>Returns the greatest key less than or equal to the given key,
or `null` if there is no such key. |
| [head](head.md) | `abstract fun head(toKey: K, inclusive: Boolean): ImmutableNavigableMap<K, V>`<br>Returns a view of the portion of this map whose keys are less than (or
equal to, if `inclusive` is true) `toKey`.  The returned
map is backed by this map, so changes in the returned map are reflected
in this map, and vice-versa.  The returned map supports all optional
map operations that this map supports.`abstract fun head(toKey: K): `[`ImmutableSortedMap`](../-immutable-sorted-map/index.md)`<K, V>`<br>See [ImmutableSortedMap.head](../-immutable-sorted-map/head.md) |
| [higherEntry](higher-entry.md) | `abstract fun higherEntry(key: K): Entry<K, V>?`<br>Returns a key-value mapping associated with the least key
strictly greater than the given key, or `null` if there
is no such key. |
| [higherKey](higher-key.md) | `abstract fun higherKey(key: K): K?`<br>Returns the least key strictly greater than the given key, or
`null` if there is no such key. |
| [lastEntry](last-entry.md) | `abstract fun lastEntry(): Entry<K, V>?`<br>Returns a key-value mapping associated with the greatest
key in this map, or `null` if the map is empty. |
| [lowerEntry](lower-entry.md) | `abstract fun lowerEntry(key: K): Entry<K, V>?`<br>Returns a key-value mapping associated with the greatest key
strictly less than the given key, or `null` if there is
no such key. |
| [lowerKey](lower-key.md) | `abstract fun lowerKey(key: K): K?`<br>Returns the greatest key strictly less than the given key, or
`null` if there is no such key. |
| [pollFirstEntry](poll-first-entry.md) | `abstract fun pollFirstEntry(): Entry<K, V>?`<br>Removes and returns a key-value mapping associated with
the least key in this map, or `null` if the map is empty. |
| [pollLastEntry](poll-last-entry.md) | `abstract fun pollLastEntry(): Entry<K, V>?`<br>Removes and returns a key-value mapping associated with
the greatest key in this map, or `null` if the map is empty. |
| [sub](sub.md) | `abstract fun sub(fromKey: K, fromInclusive: Boolean, toKey: K, toInclusive: Boolean): ImmutableNavigableMap<K, V>`<br>Returns a view of the portion of this map whose keys range from
`fromKey` to `toKey`.  If `fromKey` and
`toKey` are equal, the returned map is empty unless
`fromInclusive` and `toInclusive` are both true.  The
returned map is backed by this map, so changes in the returned map are
reflected in this map, and vice-versa.  The returned map supports all
optional map operations that this map supports.`abstract fun sub(fromKey: K, toKey: K): `[`ImmutableSortedMap`](../-immutable-sorted-map/index.md)`<K, V>`<br>See [ImmutableSortedMap.sub](../-immutable-sorted-map/sub.md) |
| [tail](tail.md) | `abstract fun tail(fromKey: K, inclusive: Boolean): ImmutableNavigableMap<K, V>`<br>Returns a view of the portion of this map whose keys are greater than (or
equal to, if `inclusive` is true) `fromKey`.  The returned
map is backed by this map, so changes in the returned map are reflected
in this map, and vice-versa.  The returned map supports all optional
map operations that this map supports.`abstract fun tail(fromKey: K): `[`ImmutableSortedMap`](../-immutable-sorted-map/index.md)`<K, V>`<br>See [ImmutableSortedMap.tail](../-immutable-sorted-map/tail.md) |

### Inherited Functions

| Name | Summary |
|---|---|
| [comparator](../-immutable-sorted-map/comparator.md) | `abstract fun comparator(): `[`Comparator`](http://docs.oracle.com/javase/6/docs/api/java/util/Comparator.html)`<in K>?`<br>Returns the comparator used to order the keys in this map, or
`null` if this map uses the [natural ordering](#) of its keys. |
| [firstKey](../-immutable-sorted-map/first-key.md) | `abstract fun firstKey(): K`<br>Returns the first (lowest) key currently in this map. |
| [lastKey](../-immutable-sorted-map/last-key.md) | `abstract fun lastKey(): K`<br>Returns the last (highest) key currently in this map. |

### Extension Functions

| Name | Summary |
|---|---|
| [toImmutableHashMap](../kotlin.collections.-map/to-immutable-hash-map.md) | `fun <K, V> Map<K, V>.toImmutableHashMap(): `[`ImmutableMap`](../-immutable-map.md)`<K, V>`<br>Returns an immutable hash map containing all key-value pairs from the original map. |
| [toImmutableMap](../kotlin.collections.-map/to-immutable-map.md) | `fun <K, V> Map<K, V>.toImmutableMap(): `[`ImmutableMap`](../-immutable-map.md)`<K, V>`<br>Returns an immutable map containing all key-value pairs from the original map. |
| [toImmutableNavigableMap](../kotlin.collections.-map/to-immutable-navigable-map.md) | `fun <K, V> Map<K, V>.toImmutableNavigableMap(): ImmutableNavigableMap<K, V>`<br>Returns an immutable sorted map containing all key-value pairs from the original map. |
| [toImmutableSortedMap](../kotlin.collections.-map/to-immutable-sorted-map.md) | `fun <K, V> Map<K, V>.toImmutableSortedMap(comparator: `[`Comparator`](http://docs.oracle.com/javase/6/docs/api/java/util/Comparator.html)`<in K>?): `[`ImmutableSortedMap`](../-immutable-sorted-map/index.md)`<K, V>`<br>Returns an immutable sorted map containing all key-value pairs from the original map. |
