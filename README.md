
# notification-react-native

## Getting started

`$ npm install notification-react-native --save`

### Mostly automatic installation

`$ react-native link notification-react-native`

### Manual installation


#### iOS

1. In XCode, in the project navigator, right click `Libraries` ➜ `Add Files to [your project's name]`
2. Go to `node_modules` ➜ `'notification-react-native` and add `RNNotification.xcodeproj`
3. In XCode, in the project navigator, select your project. Add `libRNNotification.a` to your project's `Build Phases` ➜ `Link Binary With Libraries`
4. Run your project (`Cmd+R`)<

#### Android

1. Open up `android/app/src/main/java/[...]/MainActivity.java`
  - Add `import com.reactlibrary.RNNotificationPackage;` to the imports at the top of the file
  - Add `new RNNotificationPackage()` to the list returned by the `getPackages()` method
2. Append the following lines to `android/settings.gradle`:
  	```
  	include ':react-native-notification'
  	project(':react-native-notification').projectDir = new File(rootProject.projectDir, 	'../node_modules/react-native-notification/android')
  	```
3. Insert the following lines inside the dependencies block in `android/app/build.gradle`:
  	```
      compile project(':react-native-notification')
  	```

#### Windows
[Read it! :D](https://github.com/ReactWindows/react-native)

1. In Visual Studio add the `RNNotification.sln` in `node_modules/react-native-notification/windows/RNNotification.sln` folder to their solution, reference from their app.
2. Open up your `MainPage.cs` app
  - Add `using Notification.RNNotification;` to the usings at the top of the file
  - Add `new RNNotificationPackage()` to the `List<IReactPackage>` returned by the `Packages` method


## Usage
```javascript


import React, {Component} from 'react';
import {Platform, StyleSheet, Text, View,TouchableHighlight} from 'react-native';
import notif from 'notification-react-native';
export default class App extends Component {

  test(){
    notif.show('hello',"notification riadh");
   
  }
  render() {
    return (
      <View style={styles.container}>

       

        <TouchableHighlight onPress={()=>{this.test()}}>
        <View style={{backgroundColor:"red"}}>
        <Text style={styles.instructions} >Push notification</Text>
        </View>
        </TouchableHighlight>
      
      </View>
    );
  }
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    justifyContent: 'center',
    alignItems: 'center',
    backgroundColor: '#F5FCFF',
  },
  welcome: {
    fontSize: 20,
    textAlign: 'center',
    margin: 10,
  },
  instructions: {
    textAlign: 'center',
    color: '#333333',
    marginBottom: 5,
  },
});

```
  