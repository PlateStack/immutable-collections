[immutable-collections](../index.md) / [org.platestack.structure.immutable](.)

## Package org.platestack.structure.immutable

### Types

| Name | Summary |
|---|---|
| [ImmutableCollection](-immutable-collection.md) | `interface ImmutableCollection<out E> : Collection<E>`<br>A generic [collection of elements](#) that strictly prohibits modifications after its creation. |
| [ImmutableList](-immutable-list.md) | `interface ImmutableList<out E> : List<E>, `[`ImmutableCollection`](-immutable-collection.md)`<E>`<br>A [list](#) that strictly prohibits modifications after its creation. |
| [ImmutableMap](-immutable-map.md) | `interface ImmutableMap<K, out V> : Map<K, V>`<br>A [map](#) which strict that strictly prohibits modifications after its creation. |
| [ImmutableNavigableMap](-immutable-navigable-map/index.md) | `interface ImmutableNavigableMap<K, out V> : `[`ImmutableSortedMap`](-immutable-sorted-map/index.md)`<K, V>`<br>An interface that mimics the original [NavigableMap](http://docs.oracle.com/javase/6/docs/api/java/util/NavigableMap.html) but without exposing modification functions to Kotlin source codes. |
| [ImmutableNavigableSet](-immutable-navigable-set/index.md) | `interface ImmutableNavigableSet<E> : `[`ImmutableSortedSet`](-immutable-sorted-set/index.md)`<E>`<br>An interface that mimics the original [NavigableSet](http://docs.oracle.com/javase/6/docs/api/java/util/NavigableSet.html) but without exposing modification functions to Kotlin source codes. |
| [ImmutableSet](-immutable-set.md) | `interface ImmutableSet<out E> : Set<E>, `[`ImmutableCollection`](-immutable-collection.md)`<E>`<br>A [Set](#) that strictly prohibits modifications after its creation. |
| [ImmutableSortedMap](-immutable-sorted-map/index.md) | `interface ImmutableSortedMap<K, out V> : `[`ImmutableMap`](-immutable-map.md)`<K, V>`<br>An interface that mimics the original [SortedMap](http://docs.oracle.com/javase/6/docs/api/java/util/SortedMap.html) but without exposing modification functions to Kotlin source codes. |
| [ImmutableSortedSet](-immutable-sorted-set/index.md) | `interface ImmutableSortedSet<E> : `[`ImmutableSet`](-immutable-set.md)`<E>`<br>An interface that mimics the original [SortedSet](http://docs.oracle.com/javase/6/docs/api/java/util/SortedSet.html) but without exposing modification functions to Kotlin source codes. |

### Extensions for External Classes

| Name | Summary |
|---|---|
| [java.util.NavigableMap](java.util.-navigable-map/index.md) |  |
| [java.util.SortedMap](java.util.-sorted-map/index.md) |  |
| [java.util.SortedSet](java.util.-sorted-set/index.md) |  |
| [kotlin.Array](kotlin.-array/index.md) |  |
| [kotlin.collections.Collection](kotlin.collections.-collection/index.md) |  |
| [kotlin.collections.Iterable](kotlin.collections.-iterable/index.md) |  |
| [kotlin.collections.Map](kotlin.collections.-map/index.md) |  |
| [kotlin.sequences.Sequence](kotlin.sequences.-sequence/index.md) |  |

### Functions

| Name | Summary |
|---|---|
| [immutableHashMapOf](immutable-hash-map-of.md) | `fun <K, V> immutableHashMapOf(): `[`ImmutableMap`](-immutable-map.md)`<K, V>`<br>Returns an empty shared map. The returned map is serializable.`fun <K, V> immutableHashMapOf(pair: Pair<K, V>): `[`ImmutableMap`](-immutable-map.md)`<K, V>`<br>Returns a singleton map. The returned map is serializable.`fun <K, V> immutableHashMapOf(vararg pairs: Pair<K, V>): `[`ImmutableMap`](-immutable-map.md)`<K, V>`<br>Returns a hash map with the specified contents, given as a list of pairs where the first component is the key and the second is the value. The returned map is serializable. |
| [immutableHashSetOf](immutable-hash-set-of.md) | `fun <E> immutableHashSetOf(): `[`ImmutableSet`](-immutable-set.md)`<E>`<br>Returns a shared empty set. The returned set is serializable.`fun <E> immutableHashSetOf(element: E): `[`ImmutableSet`](-immutable-set.md)`<E>`<br>Returns a singleton set. The returned set is serializable.`fun <E> immutableHashSetOf(vararg elements: E): `[`ImmutableSet`](-immutable-set.md)`<E>`<br>Returns an immutable hash set of given elements. The returned set is serializable. |
| [immutableListOf](immutable-list-of.md) | `fun <E> immutableListOf(): `[`ImmutableList`](-immutable-list.md)`<E>`<br>Returns a shared empty list. The returned list is serializable.`fun <E> immutableListOf(element: E): `[`ImmutableList`](-immutable-list.md)`<E>`<br>Returns a singleton list. The returned list is serializable.`fun <E> immutableListOf(vararg elements: E): `[`ImmutableList`](-immutable-list.md)`<E>`<br>Returns a list of given elements. The returned list is serializable. |
| [immutableMapOf](immutable-map-of.md) | `fun <K, V> immutableMapOf(): `[`ImmutableMap`](-immutable-map.md)`<K, V>`<br>Returns an empty shared map. The returned map is serializable.`fun <K, V> immutableMapOf(pair: Pair<K, V>): `[`ImmutableMap`](-immutable-map.md)`<K, V>`<br>Returns a singleton map. The returned map is serializable.`fun <K, V> immutableMapOf(vararg pairs: Pair<K, V>): `[`ImmutableMap`](-immutable-map.md)`<K, V>`<br>Returns a map with the specified contents, given as a list of pairs where the first value is the key and the second is the value. If multiple pairs have the same key, the resulting map will contain the value from the last of those pairs. |
| [immutableNavigableMapOf](immutable-navigable-map-of.md) | `fun <K : Comparable<K>, V> immutableNavigableMapOf(vararg pairs: Pair<K, V>): `[`ImmutableNavigableMap`](-immutable-navigable-map/index.md)`<K, V>`<br>`fun <K : Comparable<K>, V> immutableNavigableMapOf(comparator: `[`Comparator`](http://docs.oracle.com/javase/6/docs/api/java/util/Comparator.html)`<in K>?, vararg pairs: Pair<K, V>): `[`ImmutableNavigableMap`](-immutable-navigable-map/index.md)`<K, V>`<br>Returns a navigable map with the specified contents, given as a list of pairs where the first value is the key and the second is the value. |
| [immutableNavigableSetOf](immutable-navigable-set-of.md) | `fun <E> immutableNavigableSetOf(vararg elements: E): `[`ImmutableNavigableSet`](-immutable-navigable-set/index.md)`<E>`<br>Returns an immutable navigable set of given elements. All elements inserted into a sorted set must implement the Comparable interface.`fun <E> immutableNavigableSetOf(comparator: `[`Comparator`](http://docs.oracle.com/javase/6/docs/api/java/util/Comparator.html)`<in E>?, vararg elements: E): `[`ImmutableNavigableSet`](-immutable-navigable-set/index.md)`<E>`<br>Returns an immutable navigable set of given elements. All elements are will be sorted by the given comparator. |
| [immutableSetOf](immutable-set-of.md) | `fun <E> immutableSetOf(): `[`ImmutableSet`](-immutable-set.md)`<E>`<br>Returns a shared empty set. The returned set is serializable.`fun <E> immutableSetOf(element: E): `[`ImmutableSet`](-immutable-set.md)`<E>`<br>Returns a singleton set. The returned set is serializable.`fun <E> immutableSetOf(vararg elements: E): `[`ImmutableSet`](-immutable-set.md)`<E>`<br>Returns a set of given elements. Elements of the set are iterated in the order they were specified.
The returned set is serializable. |
| [immutableSortedMapOf](immutable-sorted-map-of.md) | `fun <K : Comparable<K>, V> immutableSortedMapOf(vararg pairs: Pair<K, V>): `[`ImmutableSortedMap`](-immutable-sorted-map/index.md)`<K, V>`<br>`fun <K, V> immutableSortedMapOf(comparator: `[`Comparator`](http://docs.oracle.com/javase/6/docs/api/java/util/Comparator.html)`<in K>?, vararg pairs: Pair<K, V>): `[`ImmutableSortedMap`](-immutable-sorted-map/index.md)`<K, V>`<br>Returns a sorted map with the specified contents, given as a list of pairs where the first value is the key and the second is the value. |
| [immutableSortedSetOf](immutable-sorted-set-of.md) | `fun <E> immutableSortedSetOf(vararg elements: E): `[`ImmutableSortedSet`](-immutable-sorted-set/index.md)`<E>`<br>Returns an immutable sorted set of given elements. All elements inserted into a sorted set must implement the Comparable interface.`fun <E> immutableSortedSetOf(comparator: `[`Comparator`](http://docs.oracle.com/javase/6/docs/api/java/util/Comparator.html)`<in E>?, vararg elements: E): `[`ImmutableSortedSet`](-immutable-sorted-set/index.md)`<E>`<br>Returns an immutable sorted set of given elements. All elements are will be sorted by the given comparator. |
| [toImmutableNavigableSet](to-immutable-navigable-set.md) | `fun <E> `[`ImmutableSortedSet`](-immutable-sorted-set/index.md)`<E>.toImmutableNavigableSet(): `[`ImmutableNavigableSet`](-immutable-navigable-set/index.md)`<E>`<br>Returns an immutable navigable set of all elements. The returned set is serializable. |
