package com.example.pokemon_app_android.data.api;

import com.example.pokemon_app_android.data.api.models.Pokemon;
import com.example.pokemon_app_android.data.api.models.PokemonList;

import io.reactivex.Single;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface PokemonDisplayService {
    @GET("pokemon")
    Single<PokemonList> getPokemons(@Query("limit") String limit);

    @GET("pokemon/{pokemonName}")
    Single<Pokemon> getPokemon(@Path("pokemonName") String pokemonName);
}
