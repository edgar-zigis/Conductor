# Conductor

```
This is a modification of the popular navigation library designed 
to support Android Lifecycle Components.
```
### Differences

* This fork fully supports Android Lifecycle Components and is up and running in the production of a few popular applications.
* In this version Lifecycleowner is bound to lifecycle of a view instead of the controller, which fixes one of the most known Observer pitfalls - double subscription.
* Unlike the original library, this fork correctly supports Google Maps.
* Some critical bugs regarding Activity lifecycle were fixed (like host router nullablity issues, lost backstack etc.)
* This library version is lighter and legacy functionality like support of RxJava1 was removed.

### Gradle
Make sure you have jitpack.io included in your gradle repositories.

```
maven { url "https://jitpack.io" }
```
```
implementation 'com.github.edgar-zigis:conductor:3.3.0'
```

## License
```
Copyright 2016 BlueLine Labs, Inc.

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

   http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```
