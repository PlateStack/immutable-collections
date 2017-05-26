[immutable-collections](../../index.md) / [org.platestack.structure.immutable](../index.md) / [ImmutableNavigableSet](.)

# ImmutableNavigableSet

`interface ImmutableNavigableSet<E> : `[`ImmutableSortedSet`](../-immutable-sorted-set/index.md)`<E>` [(source)](https://github.com/PlateStack/immutable-collections/blob/v0.1.0-alpha/src/main/kotlin/org/platestack/structure/immutable/ImmutableNavigableSet.kt#L28)

An interface that mimics the original [NavigableSet](http://docs.oracle.com/javase/6/docs/api/java/util/NavigableSet.html) but without exposing modification functions to Kotlin source codes.

Modifications are strictly forbidden after the map is created.

### Parameters

`E` - the type of elements contained in the list. The list is covariant on its element type.

### Properties

| Name | Summary |
|---|---|
| [descending](descending.md) | `abstract val descending: ImmutableNavigableSet<E>`<br>Returns a reverse order view of the elements contained in this set.
The descending set is backed by this set, so changes to the set are
reflected in the descending set, and vice-versa.  If either set is
modified while an iteration over either set is in progress (except
through the iterator's own `remove` operation), the results of
the iteration are undefined. |

### Functions

| Name | Summary |
|---|---|
| [ceiling](ceiling.md) | `abstract fun ceiling(e: E): E?`<br>Returns the least element in this set greater than or equal to
the given element, or `null` if there is no such element. |
| [descendingIterator](descending-iterator.md) | `abstract fun descendingIterator(): Iterator<E>`<br>Returns an iterator over the elements in this set, in descending order.
Equivalent in effect to `descendingSet().iterator()`. |
| [floor](floor.md) | `abstract fun floor(e: E): E?`<br>Returns the greatest element in this set less than or equal to
the given element, or `null` if there is no such element. |
| [head](head.md) | `abstract fun head(toElement: E, inclusive: Boolean): ImmutableNavigableSet<E>`<br>Returns a view of the portion of this set whose elements are less than
(or equal to, if `inclusive` is true) `toElement`.  The
returned set is backed by this set, so changes in the returned set are
reflected in this set, and vice-versa.  The returned set supports all
optional set operations that this set supports.`abstract fun head(toElement: E): `[`ImmutableSortedSet`](../-immutable-sorted-set/index.md)`<E>`<br>See [ImmutableSortedSet.head](../-immutable-sorted-set/head.md) |
| [higher](higher.md) | `abstract fun higher(e: E): E?`<br>Returns the least element in this set strictly greater than the
given element, or `null` if there is no such element. |
| [iterator](iterator.md) | `abstract fun iterator(): Iterator<E>`<br>Returns an iterator over the elements in this set, in ascending order. |
| [lower](lower.md) | `abstract fun lower(e: E): E?`<br>Returns the greatest element in this set strictly less than the
given element, or `null` if there is no such element. |
| [pollFirst](poll-first.md) | `abstract fun pollFirst(): E?`<br>Retrieves and removes the first (lowest) element,
or returns `null` if this set is empty. |
| [pollLast](poll-last.md) | `abstract fun pollLast(): E?`<br>Retrieves and removes the last (highest) element,
or returns `null` if this set is empty. |
| [sub](sub.md) | `abstract fun sub(fromElement: E, fromInclusive: Boolean, toElement: E, toInclusive: Boolean): ImmutableNavigableSet<E>`<br>Returns a view of the portion of this set whose elements range from
`fromElement` to `toElement`.  If `fromElement` and
`toElement` are equal, the returned set is empty unless `fromInclusive` and `toInclusive` are both true.  The returned set
is backed by this set, so changes in the returned set are reflected in
this set, and vice-versa.  The returned set supports all optional set
operations that this set supports.`abstract fun sub(fromElement: E, toElement: E): `[`ImmutableSortedSet`](../-immutable-sorted-set/index.md)`<E>`<br>See [ImmutableSortedSet.sub](../-immutable-sorted-set/sub.md) |
| [tail](tail.md) | `abstract fun tail(fromElement: E, inclusive: Boolean): ImmutableNavigableSet<E>`<br>Returns a view of the portion of this set whose elements are greater
than (or equal to, if `inclusive` is true) `fromElement`.
The returned set is backed by this set, so changes in the returned set
are reflected in this set, and vice-versa.  The returned set supports
all optional set operations that this set supports.`abstract fun tail(fromElement: E): `[`ImmutableSortedSet`](../-immutable-sorted-set/index.md)`<E>`<br>See [ImmutableSortedSet.tail](../-immutable-sorted-set/tail.md) |

### Inherited Functions

| Name | Summary |
|---|---|
| [comparator](../-immutable-sorted-set/comparator.md) | `abstract fun comparator(): `[`Comparator`](http://docs.oracle.com/javase/6/docs/api/java/util/Comparator.html)`<in E>?`<br>Returns the comparator used to order the elements in this set,
or null if this set uses the [natural ordering](#) of its elements. |
| [first](../-immutable-sorted-set/first.md) | `abstract fun first(): E`<br>Returns the first (lowest) element currently in this set. |
| [last](../-immutable-sorted-set/last.md) | `abstract fun last(): E`<br>Returns the last (highest) element currently in this set. |

### Extension Functions

| Name | Summary |
|---|---|
| [toImmutableNavigableSet](../kotlin.collections.-iterable/to-immutable-navigable-set.md) | `fun <E> Iterable<E>.toImmutableNavigableSet(comparator: `[`Comparator`](http://docs.oracle.com/javase/6/docs/api/java/util/Comparator.html)`<in E>? = null): ImmutableNavigableSet<E>`<br>Returns an immutable navigable set of all elements. The returned set is serializable. |
| [toImmutableNavigableSet](../to-immutable-navigable-set.md) | `fun <E> `[`ImmutableSortedSet`](../-immutable-sorted-set/index.md)`<E>.toImmutableNavigableSet(): ImmutableNavigableSet<E>`<br>Returns an immutable navigable set of all elements. The returned set is serializable. |
| [toImmutableSortedSet](../kotlin.collections.-iterable/to-immutable-sorted-set.md) | `fun <E> Iterable<E>.toImmutableSortedSet(comparator: `[`Comparator`](http://docs.oracle.com/javase/6/docs/api/java/util/Comparator.html)`<in E>? = null): `[`ImmutableSortedSet`](../-immutable-sorted-set/index.md)`<E>`<br>Returns an immutable sorted set of all elements. The returned set is serializable. |
