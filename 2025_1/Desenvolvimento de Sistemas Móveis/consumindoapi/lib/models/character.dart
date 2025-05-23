class Character {
  final String name;
  final String image;
  final String? status;
  final String? species;

  const Character({
    required this.name,
    required this.image,
    this.status,
    this.species,
  });

  factory Character.fromJson(Map<String, dynamic> json) {
    return Character(
        name: json["name"] ?? "Nome não informado",
        image: json["image"] ?? "",
        status: json["status"],
        species: json["species"],
    );
  }
}
