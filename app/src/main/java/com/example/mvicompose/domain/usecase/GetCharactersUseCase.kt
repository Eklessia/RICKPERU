package com.example.mvicompose.domain.usecase

import com.example.mvicompose.domain.model.Character
import com.example.mvicompose.domain.repository.CharacterRepository
import io.reactivex.Single
import javax.inject.Inject

class GetCharactersUseCase @Inject constructor(
    private val repository: CharacterRepository) {

    operator fun invoke(): Single<List<Character>> {
        return repository.getAll()
    }
}