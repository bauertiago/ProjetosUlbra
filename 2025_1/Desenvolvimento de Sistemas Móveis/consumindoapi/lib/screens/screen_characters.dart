import 'package:consumindoapi/models/character.dart';
import 'package:consumindoapi/screens/character_details_screen.dart';
import 'package:consumindoapi/services/character_service.dart';
import 'package:flutter/cupertino.dart';
import 'package:flutter/material.dart';

class ScreenCharacters extends StatefulWidget {

  final String title;
  final bool showAppBar;

  const ScreenCharacters({
    super.key,
    required this.title,
    this.showAppBar = false,
  });

  @override
  State<ScreenCharacters> createState() => _ScreenCharactersState();
}

class _ScreenCharactersState extends State<ScreenCharacters> {
  final CharacterService _characterService = CharacterService();
  late Future<List<Character>> _charactersFuture;

  @override
  void initState() {
    super.initState();
    _charactersFuture = _characterService.getCharacters();
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: widget.showAppBar ? AppBar(
        title: Text("Screen Charactes",
        style: Theme.of(context).textTheme.titleMedium,
        ),
        leading: IconButton(
          icon: Icon(Icons.arrow_back),
          onPressed: () {
            Navigator.pop(context);
          },
        ),
      )
          : null,
      body: FutureBuilder(
        future: _charactersFuture,
        builder: (context, snapshot) {
          if (snapshot.hasData) {
            return ListView.separated(
              itemCount: snapshot.data?.length ?? 0,
              itemBuilder: (context, index) {
                final data = snapshot.data?[index];
                if (data == null) {
                  return SizedBox();
                }
                return ListTile(
                  onTap: (){
                    Navigator.push(
                      context,
                      MaterialPageRoute(
                          builder: (context) => CharacterDetailScreen(character: data),
                      ),
                    );
                  },
                  leading: data.image.isNotEmpty
                  ? Image.network(data.image)
                  : Icon(Icons.person),
                  title: Text(data.name,
                  style: Theme.of(context).textTheme.bodyLarge),
                );
              },
              separatorBuilder: (context, index) => Divider(),
            );
          } else if (snapshot.hasError) {
            return Center(child: Text("Erro"));
          }
          return Center(child: CircularProgressIndicator());
        },
      ),
    );
  }
}