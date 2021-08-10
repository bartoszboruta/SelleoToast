import { NativeModules } from 'react-native';

type SelleoToastType = {
  showToast(text: string, delay: number): void;
};

const { SelleoToast } = NativeModules;

export default SelleoToast as SelleoToastType;
