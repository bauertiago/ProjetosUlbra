import 'dart:convert';

import 'package:consumindoapi/models/character.dart';
import 'package:http/http.dart' as http ;

class CharacterService {
  
  Future<List<Character>> getCharacters() async {
    var response = await http.get(Uri.parse("https://rickandmortyapi.com/api/character"),);

    List jsonResponse = jsonDecode(response.body)["results"].toList();

    return jsonResponse.map((item) => Character.fromJson(item)).toList();

  }
}