import * as React from 'react';

import { StyleSheet, View } from 'react-native';
import SelleoToast from 'selleo-toast';

export default function App() {
  React.useEffect(() => {
    SelleoToast.showToast('1234', 10);
  }, []);

  return <View style={styles.container}></View>;
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    alignItems: 'center',
    justifyContent: 'center',
  },
  box: {
    width: 60,
    height: 60,
    marginVertical: 20,
  },
});
