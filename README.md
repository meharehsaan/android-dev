# Mobile Applicaton Development (Android)

Android is a popular operating system for mobile devices developed by Google. It is based on the `Linux kernel` and is designed primarily for touchscreen mobile devices such as smartphones and tablets. Here are some key points to understand about Android

- `Open Source`: Android is an open-source platform, which means that the source code is available to developers for free. This allows developers to customize and modify the operating system to suit their needs.

- `App Ecosystem`: Android has a vast ecosystem of applications available on the Google Play Store. These apps range from games and productivity tools to social media and communication apps.

- `Programming Language`: Android app development is primarily done using `Java or Kotlin`, which are both officially supported by `Google`.

- `User Interface`: Android uses a user interface framework that allows developers to create user-friendly and interactive apps with features like touch gestures, animations, and layouts.

### Android History

---

- 2003: `Android Inc`. was founded by **Andy Rubin, Rich Miner, Nick Sears, and Chris White**. Google later acquired Android Inc. in `2005`.

- 2007: The first commercial Android device, the `HTC Dream` (also known as the **T-Mobile G1**), was released. This marked the beginning of Android's journey in the mobile market.

- 2008: The Android Market (now known as Google Play Store) was introduced, allowing developers to publish and distribute their apps.

- 2010: `Android 2.2` (Froyo) was released with support for Adobe Flash and improved performance.

- 2011: `Android 4.0` (Ice Cream Sandwich) brought a more unified interface for both smartphones and tablets.

- 2013: `Android 4.4` (KitKat) introduced improved performance and lower memory usage.

- 2014: `Android 5.0` (Lollipop) featured a major visual overhaul called Material Design.

- 2016: `Android 7.0` (Nougat) added multi-window support and improved notification handling.

- 2017: `Android 8.0` (Oreo) focused on background execution limits, notification channels, and Project Treble for faster updates.

- 2019: `Android 10` marked a significant change by adopting a numbering system instead of dessert names.

### Android Architecture

---

- `Linux Kernel`: This forms the core of the Android operating system, providing basic services such as **hardware abstraction, process management, and security**.

- `Libraries`: Above the kernel, Android includes a set of libraries for tasks like **graphics rendering, data storage, and network communication**. These libraries include the Android Application Framework, which provides developers with high-level APIs.

- `Android Runtime`: The Android Runtime (ART) is responsible for executing applications. Android used to use the **Dalvik** runtime before version 5.0. ART uses **Ahead-of-Time (AOT)** compilation, which improves app performance.

- `Application Framework`: This layer includes various components such as **activities, services, content providers, and broadcast receivers** that allow developers to create applications. It also includes system services for tasks like location, telephony, and notifications.

- `Applications`: At the top layer are the user applications, both pre-installed system apps and third-party apps that users download from the Play Store. These apps make use of the lower layers for functionality.

---

![Architecture](https://www.tutorialspoint.com/android/images/architecture.jpg)

### Setup Android Studio

---

- Install Java Development Kit (**JDK**).
- Download and **Install** Android Studio.
- Install Android SDK and Build Tools.
- Configure **SDK** Platforms and Tools.
- Create or Open a Project.
- Emulator or **Physical** Device Setup.
- **Coding** and Designing in Android Studio.
- Testing and Debugging.
- Building and Packaging.
- **Publishing** the App.

### Application Components

---

#### Activities

An activity represents a `single screen` with a user interface, in-short Activity performs actions on the screen.

**For example**, an email application might have one activity that shows a list of `new emails`, another activity to `compose` an email, and another activity for `reading` emails. If an application has more than one activity, then one of them should be marked as the `activity` that is presented when the application is launched.

```java
public class MainActivity extends Activity {

}
```

#### Services

A service is a component that runs in the `background` to perform `long-running` operations.

For example, a service might play music in the background while the user is in a different application, or it might `fetch` data over the network without `blocking` user interaction with an activity.

```java
public class MyService extends Service {

}
```

#### Broadcast Receivers

Broadcast Receivers simply respond to `broadcast` messages from other applications or from the system.

For example, applications can also initiate broadcasts to let `other applications` know that some data has been `downloaded` to the device and is available for them to use, so this is broadcast receiver who will intercept this communication and will initiate appropriate action.

```java
public class MyReceiver  extends  BroadcastReceiver {
   public void onReceive(context,intent){

   }
}
```

#### Content Providers

A content provider component `supplies data from one` application to others on request. Such requests are handled by the methods of the `ContentResolver` class. The data may be stored in the **file system, the database or somewhere** else entirely.

A `content provider` is implemented as a subclass of ContentProvider class and must implement a standard set of APIs that enable other applications to perform transactions.

```java
public class MyContentProvider extends  ContentProvider {
   public void onCreate(){

   }
}
```

#### Additional Components

- **Fragments** - Represents a portion of user interface in an Activity.
- **Views** - UI elements that are drawn on-screen including buttons, lists forms etc.
- **Layouts** - View hierarchies that control screen format and appearance of the views.
- **Intents** - Messages wiring components together.
- **Resources** - External elements, such as strings, constants and drawable pictures.
- **Manifest** - Configuration file for the application.

### Android Emulator

---

The Android Emulator is a valuable `tool` for Android app developers. It allows you to simulate the behavior of an Android device on your computer, making it easier to `develop, test, and debug` Android applications without the need for physical devices.

- Hardware Features
- Performance Profiling
- Device Simulation
- Operating System Versions

### Dalvik Virtual Machine (DVM)

---

JVM itself is widely used and provides quite a high performance and better memory management. However, JVM is not compatible with working optimally with low-powered handheld devices like smartphones, tablets, smartwatches, etc.Due to this reason, the Android [Dalvik Virtual Machine](https://techvidvan.com/tutorials/android-dalvik-virtual-machine/) came into existence.

A virtual machine is a software representation of an actual physical device. It implies that you don’t have a physical device but have a model in your system. The representation works quite similarly to how an actual physical device would work.

Dalvik Virtual Machine is configured to work on `low-powered` devices optimally. Dalvik Virtual Machine provides high-performance features, better memory management, and battery life for low-powered handheld devices. It was developed exclusively for android devices and allowed several apps to execute on the virtual machine.

---

![Dalvik](https://techvidvan.com/tutorials/wp-content/uploads/sites/2/2021/08/Working-of-Dex-Compiler-1.jpg)

#### Advantages

- Providing better performance and memory management
- Working `optimally` with any low-powered devices and also optimizing the battery life.
- Converting java class files to .dex file through `Dex` Compiler which can inturn execute in the Dalvik Virtual Machines
- Allowing `multiple` instances of the applications to run at the same time.
- Allowing each application to have their `instances`
- Providing faster `execution` without affecting the battery life.

#### Disadvantages

- Dalvik Virtual Machine is only supportive for Android Operating System
- Dalvik Virtual Machine has a poor garbage collection system
- The installation of the app takes more time due to the presence of Dex
- You require more instructions than register machine to implement the same high-level code.

### Android Runtime (ART)

It is the runtime environment used by the Android operating system to run applications. ART is the `successor` to the earlier Dalvik Virtual Machine (DVM) and was introduced in Android 5.0 (Lollipop). ART offers several improvements over DVM and is designed to enhance the performance and efficiency of Android apps. Here are some key features and concepts related to ART:

- Ahead-of-Time Compilation
- Improved Performance
- Improved Battery Life
- Smoother User Experience
- Compatibility with Older Apps

### Application Framework

---

![Framework](https://www.guru99.com/images/2/032020_1146_AndroidArch2.png)

### Android Manifest

---

The manifest file specifies the application `metadata`, which includes its `icon`, `version` number, themes, etc, and additional top-level nodes can specify any required `permissions`, and unit tests, and define hardware, screen, or `platform requirements` including components of the application such as activities, services, broadcast receivers, content providers etc.

- It is responsible to protect the application to access any protected parts by providing the permissions.
- It also declares the android api that the application is going to use.
- It lists the instrumentation classes. The instrumentation classes provides profiling and other informations. These informations are removed just before the application is published etc.

### R.java

---

Android R.java is an auto-generated file by `aapt` (Android Asset Packaging Tool) that contains resource IDs for all the resources of res/ directory.

If you create any component in the activity_main.xml file, id for the corresponding component is automatically `created` in this file. This id can be used in the activity source file to perform any action on the component.

- `Resource Mapping` - These resources can include layout files, drawables, strings, IDs, and more.
- `Auto-Generated` - it is automatically generated by the Android build tools, and you should never edit it directly. Any changes you make to your resources (e.g., adding images, layouts, or strings) are reflected in the "R.java" file the next time you build your project.
- `Organized by Resource Type` - The "R.java" file is organized into sections, each representing a specific resource type. For example, you'll find a section for layout resources, another for string resources, and so on.
- `Resource IDs` - Each resource is assigned a unique integer ID within the "R.java" file. You can use these IDs in your Java or XML code to reference specific resources.

##### Example Usage

```java
setContentView(R.layout.activity_main);
```

#### Compile-Time Checks

The "R.java" file ensures that resources are referenced correctly and that you don't run into runtime issues due to missing or incorrect resource references. It provides a level of safety during development.

### Resource Types

---

#### Drawable/

Refer to a resource type that represents `graphics, images, icons, and other visual assets` that can be used in your Android application's user interface. Drawables are essential for creating a visually appealing and responsive user interface.

- Image files like `.png, .jpg, .gif or XML` files that are compiled into bitmaps, state lists, shapes, animation drawable. They are saved in `res/drawable/` and accessed from the `R.drawable` class.

#### layout/

Refers to the XML files that define the structure and arrangement of user interface elements within an Android application. Layout files are used to create the visual representation of your app's user interface, specifying how different widgets and views are positioned and displayed on the screen.

XML files that define a user interface layout. They are saved in `res/layout/` and accessed from the `R.layout` class.

- `LinearLayout` - LinearLayout is a view group that arranges its child views either vertically (in a single column) or horizontally (in a single row). It's a simple and easy-to-use layout for creating linear arrangements of UI elements.

- `RelativeLayout` - RelativeLayout allows you to specify the positioning of child views relative to one another or to the parent layout. It's versatile and useful for creating complex, rule-based UI designs.

- `GridLayout` - GridLayout is a flexible layout that allows you to create grid-based UIs with a specified number of rows and columns. It's ideal for responsive layouts.

- `FrameLayout` - FrameLayout is a simple layout that places its child views on top of one another. It's often used for creating layered UI elements.

#### values/

XML files that contain simple values, such as `strings, integers, and colors`. For example, here are some filename conventions for resources you can create in this directory.

#### xml/

Arbitrary XML files that can be read at runtime by calling `Resources.getXML().` You can save various configuration files here which will be used at run time.

### Activities

---

An activity represents a single screen with a user `interface` just like window or frame of `Java.Android` activity is the subclass of `ContextThemeWrapper` class.

In C, C++ or Java programming language then you must have seen that your program starts from `main()` function. Very similar way, Android system initiates its program with in an Activity starting with a call on `onCreate()` callback method. There is a sequence of callback methods that start up an activity and a sequence of `callback` methods that tear down an activity.

![Activity Lifecycle](https://www.tutorialspoint.com/android/images/activity.jpg)

- `onCreate()` - This is the first callback and called when the activity is first created.

- `onStart()` - This callback is called when the activity becomes visible to the user.

- `onResume()` - This is called when the user starts interacting with the application.

- `onPause()` - The paused activity does not receive user input and cannot execute any code and called when the current activity is being paused and the previous activity is being resumed.

- `onStop()` - This callback is called when the activity is no longer visible.

- `onDestroy()` - This callback is called before the activity is destroyed by the system.

- `onRestart()` - This callback is called when the activity restarts after stopping it.

### Fragments

---

A Fragment is a piece of an activity which enable more `modular` activity design. It is a modular and `reusable` component that represents a portion of a `user interface` or behavior within an activity. (`sub-activity`)

A fragment has its own layout and its own behaviour with its own life cycle callbacks. You can `add or remove` fragments in an activity while the activity is `running`. You can combine multiple fragments in a single activity to build a multi-pane UI. A fragment can be used in `multiple activities` Fragment life cycle is closely related to the life cycle of its host activity which means when the activity is paused, all the fragments available in the activity will also be stopped. A fragment can implement a behaviour that has `no user interface` component.

![[Fragment](https://www.tutorialspoint.com/android/android_fragments.htm)](https://www.tutorialspoint.com/android/images/fragment.jpg)

- `Single frame fragments` − Single frame fragments are using for hand hold devices like mobiles, here we can show only one fragment as a view.

- `List fragments` − fragments having special list view is called as list fragment.

- `Fragments transaction` − Using with fragment transaction. we can move one fragment to another fragment.

### Intents and Filters

---

The intent itself, an Intent object, is a passive data structure holding an abstract description of an operation to be performed.

![Intents](https://www.tutorialspoint.com/android/images/intent.jpg)

- Explicit intent going to be connected internal world of application,suppose if you wants to connect one activity to another activity, we can do this quote by explicit intent, below image is connecting first activity to second activity by clicking button.

```java
gotoSignupButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Signin.this, Signup.class);
                startActivity(intent);
            }
        });
```

- Implicit intents do not name a target and the field for the component name is left blank. Implicit intents are often used to activate components in other applications.

```java
Uri webpage = Uri.parse("https://www.example.com");
Intent implicitIntent = new Intent(Intent.ACTION_VIEW, webpage);
if (implicitIntent.resolveActivity(getPackageManager()) != null) {
    startActivity(implicitIntent);
}
```

#### Key Differences

- Explicit intents are used for communication within the same app and require specifying the component's class name, while implicit intents are used for inter-app communication and specify an action that can be handled by multiple components.
- Explicit intents are targeted and predictable, while implicit intents are action-based and rely on the Android system to find a suitable component to handle the action.
- Explicit intents are often used for in-app navigation, while implicit intents are used for tasks like sharing data or opening external content.

### Event handlers

In Android app development, event handling involves responding to **`user interactions`** within the app's user interface. Events include **`button clicks, screen touches, text input`**, and more. Event handlers are defined in Java or Kotlin and are associated with UI elements like buttons and text fields.

**Event Listeners** − An event listener is an interface in the View class that contains a single callback method. These methods will be called by the Android framework when the View to which the listener has been registered is triggered by user interaction with the item in the UI.

**Event Listeners Registration** − Event Registration is the process by which an Event Handler gets registered with an Event Listener so that the handler is called when the Event Listener fires the event.

**Event Handlers** − When an event happens and we have registered an event listener for the event, the event listener calls the Event Handlers, which is the method that actually handles the event.

```java
Button myButton = findViewById(R.id.myButton);
myButton.setOnClickListener {
    Toast.makeText(this, "Button clicked!", Toast.LENGTH_SHORT).show()
}
```

```java
// Event Handlers and Listners
OnClickListener()
OnLongClickListener()
OnFocusChangeListener()
OnFocusChangeListener()
OnTouchListener()
OnMenuItemClickListener()
onCreateContextMenuItemListener()
```

### Toast in Android

---

In Android, a "Toast" is a simple and lightweight way to provide feedback or display short-lived messages to the user.

Toasts typically appear as a small pop-up notification at the bottom of the screen, stay visible for a short duration, and then disappear. They are commonly used to display information, notifications, or brief messages to the user.

```java
Toast.makeText(context, "This is a Toast message", Toast.LENGTH_SHORT).show();
```

You can also customize the layout of a Toast by inflating a custom layout and displaying it within the Toast. This allows you to create more complex or styled notifications.

```java
LayoutInflater inflater = getLayoutInflater();
View customLayout = inflater.inflate(R.layout.custom_toast_layout, null);

Toast customToast = new Toast(getApplicationContext());
customToast.setGravity(Gravity.CENTER, 0, 0);
customToast.setDuration(Toast.LENGTH_LONG);
customToast.setView(customLayout);
customToast.show();
```

### Bundle

---

In Android app development, a `Bundle` is a container for passing data between components within an app or between `different` Android apps.

It's a `key-value pair` collection that is used to store and transfer data, such as primitive data types (int, boolean, etc.), complex objects, or more commonly, data that needs to be passed between `activities` or fragments.

- Passing Data Between Activities
- Passing Data Between Fragments
- Saving and Restoring State
- Inter-Process Communication (IPC)

```java
Intent intent = new Intent(this, SecondActivity.class);
Bundle bundle = new Bundle();
bundle.putString("key", "github.com/meharehsaan");
intent.putExtras(bundle);
startActivity(intent);
```

In second activity getting bundle

```java
Bundle bundle = getIntent().getExtras();
if (bundle != null) {
    String data = bundle.getString("key");
}
```

### Views, Controls and Spinner

---

`Views` are a fundamental concept in the design of `user interfaces`, and they can serve various purposes, including displaying information, receiving user input, and presenting data in a structured format.

- **TextView, EditText, Button, CheckBox, RadioButton, Spinner, ListView, RecyclerView, GridView, ScrollView, CalendarView etc**

`Controls` typically refer to `user interface` elements or components that users interact with to perform actions, input data, or make selections within an application. Controls are essential for creating a `user-friendly` and functional software interface. The specific controls available may vary depending on the platform or framework being used.

- **Slider, Progress Bar, Switch, Checkbox, Text Field etc**

A `Spinner` is a **UI widget** in Android that allows the user to select an item from a dropdown list. It's often used to display a list of options, and the user can choose one by tapping on it.

### Recycler View

---

A `RecyclerView` is a powerful and flexible UI component used to display `lists` and `grids of items`. It's an advanced replacement for the older `ListView` and `GridView` components, offering improved performance and greater control over the presentation of data.

The RecyclerView is a key element for efficiently displaying large data sets in a `scrollable` and `reusable` manner.

- `Adapter` - Create a custom adapter that extends `RecyclerView.Adapter` and provides data to the RecyclerView. Override methods like **onCreateViewHolder**() and **onBindViewHolder**() to create and bind views for each item and **getItem**().

- `ViewHolder` - Create a **ViewHolder** class that holds references to the views in each item. This reduces the **overhead** of finding views repeatedly.

- `LayoutManager` - Set the desired layout manager for the RecyclerView. For example, **LinearLayoutManager** for a vertical list.

- `Activity/Fragment Code` - In your activity or fragment, **initialize** the RecyclerView, set the adapter, and configure it as needed:

```java
RecyclerView recyclerView = findViewById(R.id.recyclerView);
MyAdapter adapter = new MyAdapter(dataList); // Your custom adapter
recyclerView.setLayoutManager(new LinearLayoutManager(this));
recyclerView.setAdapter(adapter);
```

```xml
<androidx.recyclerview.widget.RecyclerView
    android:id="@+id/recyclerView"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
/>
```

### Design Patterns

---

Design patterns are reusable solutions to common `problems` that occur during software design and `development`. They provide a template or a general `guideline` for `structuring` code to solve specific types of problems in a `consistent` and efficient way.

- **Creational Patterns**
  - Singleton Pattern
  - Builder Pattern
  - Prototype Pattern
- **Structural Patterns**
  - Adapter Pattern
  - Decorator Pattern
  - Proxy Pattern
- **Behavioral Patterns**
  - Observer Pattern
  - Strategy Pattern
  - Chain of Responsibility Pattern

#### Singelton

Ensures a class has only `one instance` and provides a `global` point of access to that instance. It is used when you want to limit the `instantiation` of a class to a single object and maintain a single point of access to that object throughout the `lifetime` of an application.

```java
public class Singleton {
    private static Singleton instance;
    private Singleton() { // ----- }
    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
```

- Private Constructor.
- Static reference of class.
- One Static method.
- Globally excess object reference.
- Consistency across thread.

### Serialization and parcelable

---

Serialization and Parcelable are used to `pass data` between different components, such as between activities or between the app and external storage. They serve the same purpose of converting objects into a `format` that can be easily `transported` or persisted and then `reconstructing` those objects from the `stored` format.

#### Serialization

Serialization is a Java-based mechanism for converting an object's state (including its fields) into a byte stream. It is part of the Java standard library and can be used in Android.

In Java's built-in serialization when saving and restoring objects to/from files, databases, or when sending data across networks using Java's Object Input/Output Streams.

- Serialization works with Java objects, and it serializes the entire object, including its methods and fields.
- Uses `memory` so less efficient.

#### Parcelable

Parcelable is an Android-specific mechanism designed for `efficiently` passing data between Android components. It is optimized for `performance` on the Android platform.

Parcelable is commonly used to pass data between Android `activities and fragments` or when transferring data between different parts of an Android app, such as in `Intent extras`.

- Uses bundle instead of **memory** become more efficients.

### References

---

- [Application Components](https://www.tutorialspoint.com/android/android_application_components.htm)
