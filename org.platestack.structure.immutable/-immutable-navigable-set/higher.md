[immutable-collections](../../index.md) / [org.platestack.structure.immutable](../index.md) / [ImmutableNavigableSet](index.md) / [higher](.)

# higher

`abstract fun higher(e: E): E?`

Returns the least element in this set strictly greater than the
given element, or `null` if there is no such element.

### Parameters

`e` - the value to match

### Exceptions

`ClassCastException` - if the specified element cannot be
    compared with the elements currently in the set

`NullPointerException` - if the specified element is null
    and this set does not permit null elements

**Return**
the least element greater than `e`,
    or `null` if there is no such element

