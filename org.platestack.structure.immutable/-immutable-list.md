[immutable-collections](../index.md) / [org.platestack.structure.immutable](index.md) / [ImmutableList](.)

# ImmutableList

`interface ImmutableList<out E> : List<E>, `[`ImmutableCollection`](-immutable-collection.md)`<E>`

A [list](#) that strictly prohibits modifications after its creation.

### Parameters

`E` - the type of elements contained in the list. The list is covariant on its element type.

### Extension Functions

| Name | Summary |
|---|---|
| [toImmutableNavigableSet](kotlin.collections.-iterable/to-immutable-navigable-set.md) | `fun <E> Iterable<E>.toImmutableNavigableSet(comparator: `[`Comparator`](http://docs.oracle.com/javase/6/docs/api/java/util/Comparator.html)`<in E>? = null): `[`ImmutableNavigableSet`](-immutable-navigable-set/index.md)`<E>`<br>Returns an immutable navigable set of all elements. The returned set is serializable. |
| [toImmutableSortedSet](kotlin.collections.-iterable/to-immutable-sorted-set.md) | `fun <E> Iterable<E>.toImmutableSortedSet(comparator: `[`Comparator`](http://docs.oracle.com/javase/6/docs/api/java/util/Comparator.html)`<in E>? = null): `[`ImmutableSortedSet`](-immutable-sorted-set/index.md)`<E>`<br>Returns an immutable sorted set of all elements. The returned set is serializable. |
