import { NativeModules } from 'react-native';

type SelleoToastType = {
  multiply(a: number, b: number): Promise<number>;
};

const { SelleoToast } = NativeModules;

export default SelleoToast as SelleoToastType;
