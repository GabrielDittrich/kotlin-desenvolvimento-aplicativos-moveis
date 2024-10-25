package tandera.hackerspace.coomposeroom.data

import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update

interface LivroDao {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun addLivro(livro: Livro)

    @Update
    suspend fun atualizarLivro(livro: Livro)

    @Delete
    suspend fun deletarLivro(livro: Livro)

    @Query("SELECT * FROM livro_table")
    suspend fun listarLivros() : List<Livro>

    @Query("SELECT * FROM livro_table ORDER BY ano ASC")
    suspend fun listarLivrosEmOrdem() : List<Livro>

}