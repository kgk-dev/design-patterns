# Decorator Pattern

> **Decorator Pattern** attaches additional responsibilities to an object dynamically. Decorators provide a flexible alternative to subclassing for extending functionality. 
 
### Here's about decorator

- Decorators have the same subtypes as the objects they docorate
- You can use one or more decorators to wrap an object
- Given that the decorator has the same subtypes as the object it decorates, we can pass around a decorated object in place of the original object
- **The decorators add its own behaviour befor and/or after delegating to the object it decorates to do the rest of the job**
- Objects can be decorated at any time, so we can decorate objects dynamically at runtime with as many decorators as we like