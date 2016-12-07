# smartboot
Bootstrap utility for java base component design

## The Application Framework
Many leading programming languages come with a lot of application frameworks that can be used to simplify and speed up development. 
Taking a decision to use an application framework in a product design limit the scope of reuse to the one of that framework. For example, building a product that uses CDI as a model for dependency injection limit the scope of reuse of that product to CDI-based application. This also applies to the use of spring as a basic framework.
### Choosing a dependency injection framework
In many cases, the scope of the reusable component we are building is limited enough to justify the rewrite of the component in many frameworks. In these cases, it is not a problem to just select a dependency injection framework to jump start your component.
In most cases, it is important to keep the product as free as possible from any type of dependency or frameworks. Doing this really make the component reusable. If we look at many component developed by the apache foundation, in particular the apache common components, we can see that they realy try not to incorporate dependencies.
### Native Dependency Injection Concept
The java community has brought out some elegant way of designing product without having to involve any dependency injection framework. One of the use the “Service Provider” design pattern to load and use services.
See: java.util.ServiceLoader<S>
The documentation of this class gives a great overview of a way of dynamically loading services in java. This way might not be used as extensively as know dependency injection concepts like spring or CDI, it gives a way to keep the development of a component free of unnecessary dependencies.
## Service Based Product Design
Designing a product start with defining a set of functionalities to be provided by the product. In order to encourage reuse, a clean product design starts with the breakdown of the product's overall functionalities in services. This approach brings a couple pf advantages:
### Adapting existing components
Some functionalities can be found fully provided by existing components. Even if those components might not do exactly what we are expecting them to do, we might find a way of adapting to our actual need, thus shortening the time we need to get to first version of our product.
### Making parts exchangeable
A well designed service model can allow us to provide exchangeable parts (services). This will contribute a lot to overall reuse of the product.
### Testing Parts
Breaking down the product into well defined parts will have the definitive advantage of improving the quality of each independent part. It is very important to define parts as to enable them to be tested independently of the rest of the product.
