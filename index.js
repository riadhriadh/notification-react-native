
import { NativeModules } from 'react-native';

const { RNNotification } = NativeModules;
export const show = () => RNNotification.show();

export default RNNotification;
