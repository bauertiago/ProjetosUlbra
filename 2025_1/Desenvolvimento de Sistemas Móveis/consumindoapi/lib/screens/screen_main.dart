import 'package:consumindoapi/screens/screen_characters.dart';
import 'package:consumindoapi/screens/screen_movies.dart';
import 'package:flutter/cupertino.dart';
import 'package:flutter/material.dart';

class ScreenMain extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    final theme = Theme.of(context);

    return DefaultTabController(
      length: 2,
      child: Scaffold(
        appBar: AppBar(
          backgroundColor: theme.colorScheme.primary,
          title: Text(
            "MENU",
            style: theme.textTheme.titleLarge,
          ),
          leading: Builder(
            builder: (context) {
              return IconButton(
                icon: Icon(Icons.menu, color: Colors.white),
                onPressed: () {
                  Scaffold.of(context).openDrawer();
                },
              );
            },
          ),
          bottom: TabBar(
            tabs: [
              Icon(Icons.group),
              Icon(Icons.movie),
            ],
          ),
        ),
        body: TabBarView(
          children: [
            ScreenCharacters(title: '', showAppBar: false),
            ScreenMovies()],
        ),
        drawer: Builder(
          builder: (context) {
            return Drawer(
              child: ListView(
                children: [
                  DrawerHeader(
                    decoration: BoxDecoration(color: theme.colorScheme.primary),
                    child: Text(
                      "MENU",
                      style: theme.textTheme.titleLarge,
                    ),
                  ),
                  ListTile(
                    title: Text("Screen Characters",
                    style: theme.textTheme.titleMedium),
                    leading: Icon(
                      Icons.group,
                      color: theme.colorScheme.primary,
                    ),
                    onTap: () {
                      Navigator.push(
                        context,
                        MaterialPageRoute(
                          builder: (context) => ScreenCharacters(title: '', showAppBar: true),
                        ),
                      );
                    },
                  ),
                  ListTile(
                    title: Text("Screen Movies",
                        style: theme.textTheme.titleMedium),
                    leading: Icon(
                      Icons.movie,
                      color: theme.colorScheme.primary,
                    ),
                    onTap: () {
                      Navigator.push(
                        context,
                        MaterialPageRoute(builder: (context) => ScreenMovies()),
                      );
                    },
                  ),
                ],
              ),
            );
          },
        ),
      ),
    );
  }
}
