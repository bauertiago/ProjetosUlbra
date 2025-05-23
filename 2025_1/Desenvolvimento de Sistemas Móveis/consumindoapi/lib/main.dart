import 'package:consumindoapi/models/character.dart';
import 'package:consumindoapi/screens/screen_main.dart';
import 'package:consumindoapi/services/character_service.dart';
import 'package:flutter/material.dart';

void main() {
  runApp(const MyApp());
}

class MyApp extends StatelessWidget {
  const MyApp({super.key});

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      theme: ThemeData(
        useMaterial3: true,
        colorScheme: ColorScheme.dark(
          primary: Color(0xFF1565C0),
          secondary: Color(0xFF42A5F5),
          brightness: Brightness.light,
        ),
        scaffoldBackgroundColor: Color(0xFFF5F5F5),
        appBarTheme: AppBarTheme(
          backgroundColor: Color(0xFF1565C0),
          foregroundColor: Colors.black87,
        ),
        iconTheme: IconThemeData(color: Color(0xFF42A5F5)),
        tabBarTheme: TabBarTheme(
          labelColor: Colors.white,
          unselectedLabelColor: Colors.white38,
        ),
        drawerTheme: DrawerThemeData(backgroundColor: Color(0xFFF5F5F5)),
        textTheme: TextTheme(
          bodyLarge: TextStyle(color: Colors.black87, fontSize: 18),
          bodyMedium: TextStyle(color: Colors.black54, fontSize: 16),
          titleLarge: TextStyle(
            color: Colors.white,
            fontWeight: FontWeight.bold,
            fontSize: 20,
          ),
          titleMedium: TextStyle(
            color: Colors.black54,
            fontWeight: FontWeight.w600,
            fontSize: 20,
          ),
        ),
      ),
      home: ScreenMain(),
    );
  }
}
