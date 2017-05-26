[immutable-collections](../../index.md) / [org.platestack.structure.immutable](../index.md) / [ImmutableSortedSet](.)

# ImmutableSortedSet

`interface ImmutableSortedSet<E> : `[`ImmutableSet`](../-immutable-set.md)`<E>`

An interface that mimics the original [SortedSet](http://docs.oracle.com/javase/6/docs/api/java/util/SortedSet.html) but without exposing modification functions to Kotlin source codes.

Modifications are strictly forbidden after the map is created.

### Parameters

`E` - the type of elements contained in the list. The list is covariant on its element type.

### Functions

| Name | Summary |
|---|---|
| [comparator](comparator.md) | `abstract fun comparator(): `[`Comparator`](http://docs.oracle.com/javase/6/docs/api/java/util/Comparator.html)`<in E>?`<br>Returns the comparator used to order the elements in this set,
or null if this set uses the [natural ordering](#) of its elements. |
| [first](first.md) | `abstract fun first(): E`<br>Returns the first (lowest) element currently in this set. |
| [head](head.md) | `abstract fun head(toElement: E): ImmutableSortedSet<E>`<br>Returns a view of the portion of this set whose elements are
strictly less than toElement.  The returned set is
backed by this set, so changes in the returned set are
reflected in this set, and vice-versa.  The returned set
supports all optional set operations that this set supports. |
| [last](last.md) | `abstract fun last(): E`<br>Returns the last (highest) element currently in this set. |
| [sub](sub.md) | `abstract fun sub(fromElement: E, toElement: E): ImmutableSortedSet<E>`<br>Returns a view of the portion of this set whose elements range
from fromElement, inclusive, to toElement,
exclusive.  (If fromElement and toElement are
equal, the returned set is empty.)  The returned set is backed
by this set, so changes in the returned set are reflected in
this set, and vice-versa.  The returned set supports all
optional set operations that this set supports. |
| [tail](tail.md) | `abstract fun tail(fromElement: E): ImmutableSortedSet<E>`<br>Returns a view of the portion of this set whose elements are
greater than or equal to fromElement.  The returned
set is backed by this set, so changes in the returned set are
reflected in this set, and vice-versa.  The returned set
supports all optional set operations that this set supports. |

### Extension Functions

| Name | Summary |
|---|---|
| [toImmutableNavigableSet](../to-immutable-navigable-set.md) | `fun <E> ImmutableSortedSet<E>.toImmutableNavigableSet(): `[`ImmutableNavigableSet`](../-immutable-navigable-set/index.md)`<E>`<br>Returns an immutable navigable set of all elements. The returned set is serializable. |
| [toImmutableNavigableSet](../kotlin.collections.-iterable/to-immutable-navigable-set.md) | `fun <E> Iterable<E>.toImmutableNavigableSet(comparator: `[`Comparator`](http://docs.oracle.com/javase/6/docs/api/java/util/Comparator.html)`<in E>? = null): `[`ImmutableNavigableSet`](../-immutable-navigable-set/index.md)`<E>`<br>Returns an immutable navigable set of all elements. The returned set is serializable. |
| [toImmutableSortedSet](../kotlin.collections.-iterable/to-immutable-sorted-set.md) | `fun <E> Iterable<E>.toImmutableSortedSet(comparator: `[`Comparator`](http://docs.oracle.com/javase/6/docs/api/java/util/Comparator.html)`<in E>? = null): ImmutableSortedSet<E>`<br>Returns an immutable sorted set of all elements. The returned set is serializable. |

### Inheritors

| Name | Summary |
|---|---|
| [ImmutableNavigableSet](../-immutable-navigable-set/index.md) | `interface ImmutableNavigableSet<E> : ImmutableSortedSet<E>`<br>An interface that mimics the original [NavigableSet](http://docs.oracle.com/javase/6/docs/api/java/util/NavigableSet.html) but without exposing modification functions to Kotlin source codes. |
