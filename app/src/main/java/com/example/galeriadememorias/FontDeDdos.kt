package com.example.galeriadememorias

import com.example.galeriadememorias.model.IdImageDescricao

class FontDeDdos {

    fun CarregaListaDados():List<IdImageDescricao>
    {
        return listOf<IdImageDescricao>(

            IdImageDescricao(R.drawable.bielzin, R.string.bielzin),
            IdImageDescricao(R.drawable.casalgay,R.string.casalgay),
            IdImageDescricao(R.drawable.darllypablo, R.string.darllypablo),
            IdImageDescricao(R.drawable.diadehp, R.string.diadehp),
            IdImageDescricao(R.drawable.minhasapadrao, R.string.minhasapadrao),
            IdImageDescricao(R.drawable.minhasmeninas, R.string.minhasmeninas),
            IdImageDescricao(R.drawable.nanagigi, R.string.nanagigi),
            IdImageDescricao(R.drawable.pabloanddarlly,R.string.pabloanddarlly),
            IdImageDescricao(R.drawable.pessoasapocalpticas, R.string.pessoasapocalipticas)



        )
    }
}