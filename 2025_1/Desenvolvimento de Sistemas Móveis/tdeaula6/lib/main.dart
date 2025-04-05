import 'package:flutter/material.dart';

void main() {
  runApp(const MyApp());
}

class MyApp extends StatelessWidget {
  const MyApp({super.key});

  @override
  Widget build(BuildContext context) {
    return MaterialApp(home: PaginaHome());
  }
}

class PaginaHome extends StatelessWidget {
  const PaginaHome({super.key});

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Center(
          child: const Text(
            "Flutter layout demo",
            style: TextStyle(color: Colors.white, fontSize: 26),
          ),
        ),
        backgroundColor: Colors.teal,
      ),
      body: Column(
        children: [
          Image.network(
            "https://images.unsplash.com/photo-1471115853179-bb1d604434e0?q=80&w=2564&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D",
          ),
          SizedBox(height: 20),
          Padding(
            padding: const EdgeInsets.all(16),
            child: Row(
              children: [
                Expanded(
                  flex: 2,
                  child: Column(
                    crossAxisAlignment: CrossAxisAlignment.start,
                    children: [
                      Text(
                        "Oeschinen Lake Campground",
                        style: TextStyle(fontSize: 18),
                      ),
                      Text(
                        "Kandersteg Switzerland",
                        style: TextStyle(
                          fontSize: 16,
                          color: Colors.orangeAccent,
                        ),
                      ),
                    ],
                  ),
                ),
                Icon(Icons.star, color: Colors.red, size: 30),
                SizedBox(width: 5),
                Container(
                  margin: EdgeInsets.only(right: 16),
                  child: Text("41", style: TextStyle(fontSize: 20)),
                ),
              ],
            ),
          ),
          SizedBox(height: 16),
          Row(
            mainAxisAlignment: MainAxisAlignment.spaceEvenly,
            children: [
              Column(
                children: [
                  Icon(Icons.phone, color: Colors.indigoAccent),
                  Text("CALL", style: TextStyle(color: Colors.indigoAccent)),
                ],
              ),
              Column(
                children: [
                  Icon(Icons.room_outlined, color: Colors.indigoAccent),
                  Text("ROUTE", style: TextStyle(color: Colors.indigoAccent)),
                ],
              ),
              Column(
                children: [
                  Icon(Icons.share, color: Colors.indigoAccent),
                  Text("SHARE", style: TextStyle(color: Colors.indigoAccent)),
                ],
              ),
            ],
          ),
          Padding(
            padding: const EdgeInsets.all(16),
            child: Row(
              children: [
                Expanded(
                  child: Column(
                    children: [
                      Text(
                        "Lake Oeschinen lies at the foot of the Blüemlisalp in the Bernese Alps. Situated 1,578 meters above sea level, it is one of the larger Alpine Lakes. A gondola ride from Kandersteg, followed by a half-hour walk through pastures and pine forest, leads you to the lake, which warms to 20 degrees Celsius in the summer. Activities enjoyed here include rowing, and riding the summer toboggan run",
                        textAlign: TextAlign.justify,
                        style: TextStyle(fontSize: 16),
                      ),
                    ],
                  ),
                ),
              ],
            ),
          ),
        ],
      ),
    );
  }
}
