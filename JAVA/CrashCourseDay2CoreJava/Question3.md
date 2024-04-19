- Using String:

Efficiency: This approach involves creating a new String object for each character appended in the loop.
Since strings are immutable in Java, this results in creating multiple string objects,
which can be inefficient especially for large strings.
Suitability: This approach is suitable for small strings where efficiency is not a major concern.

- Using StringBuilder:

Efficiency: StringBuilder is mutable, so it doesn't create a new object for each character appended.
Instead, it modifies the existing StringBuilder object directly, making it more efficient than using String concatenation.
Suitability: This approach is suitable for larger strings or situations where performance is important,
as it avoids unnecessary object creations.

- Using StringBuffer:

Efficiency: StringBuffer is similar to StringBuilder in that it's mutable,
but it's also thread-safe, which means it's synchronized and can be safely used in concurrent environments.
However, this synchronization comes with a performance cost compared to StringBuilder.
Suitability: StringBuffer is suitable for situations where thread safety is required,
such as in multithreaded environments. However, 
if thread safety is not needed, StringBuilder is usually preferred due to its better performance.
