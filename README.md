Immutable Collections for Kotlin and Java
=========================================
This project was inspired on [kotlinx.collections.immutable] so it shares some concepts from that project.

The main difference is that [PlateStack's immutable-collections] does not requires any additional dependency, 
everything is built on top of the Java 8 collection API.

This project also has more extension functions to blend with Kotlin's STD lib. For example, If you see a `toList()`
from Kotlin's STD LIB you should also see a `toImmutableList()` from PlateStack's Immutable Collections.

This library also introduces immutable interfaces for [SortedSet], [NavigableSet], [SortedMap] and [NavigableMap].
Kotlin has no read-only interface for that types, so our immutable version does not extends the original types but
they mimic them without exposing modification methods. 

[kotlinx.collections.immutable]: https://github.com/Kotlin/kotlinx.collections.immutable
[PlateStack's immutable-collections]: https://github.com/Kotlin/kotlinx.collections.immutable
[SortedSet]: https://docs.oracle.com/javase/8/docs/api/java/util/SortedSet.html
[NavigableSet]: https://docs.oracle.com/javase/8/docs/api/java/util/NavigableSet.html
[SortedMap]: https://docs.oracle.com/javase/8/docs/api/java/util/SortedMap.html
[NavigableMap]: https://docs.oracle.com/javase/8/docs/api/java/util/NavigableMap.html

Documentation
-------------
The KDoc is shared in the [kdoc branch] and the JavaDoc in <http://platestack.github.io/immutable-collections>.

Be aware that locations might change without redirects. 

[kdoc branch]: https://github.com/PlateStack/immutable-collections/blob/kdoc/org.platestack.structure.immutable/index.md
