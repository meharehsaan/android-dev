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



## References 

- [Application Components](https://www.tutorialspoint.com/android/android_application_components.htm)