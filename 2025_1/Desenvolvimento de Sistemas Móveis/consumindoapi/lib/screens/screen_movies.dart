import 'package:flutter/cupertino.dart';
import 'package:flutter/material.dart';

class ScreenMovies extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      body: Column(
        crossAxisAlignment: CrossAxisAlignment.center,
        mainAxisAlignment: MainAxisAlignment.center,
        children: [Center(child: Text("Screen Movies"))],
      ),
    );
  }
}
