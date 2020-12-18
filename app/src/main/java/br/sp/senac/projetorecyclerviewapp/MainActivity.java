package br.sp.senac.projetorecyclerviewapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Times> lstTimes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Inserindo os livros no arrayList vazio
        lstTimes = new ArrayList<>();
        lstTimes.add(new Times("Leverkusen","O Bayer 04 Leverkusen Fußball GmbH, também conhecido como Bayer 04 Leverkusen, Bayer Leverkusen, Leverkusen ou simplesmente Bayer, é um clube de futebol alemão sediado em Leverkusen, na Renânia do Norte-Vestefália","1",R.drawable.Leverkusen));
        lstTimes.add(new Times("BayernDeMunique","Futball-Club Bayern München, comumente referido como Bayern ou Bayern de Munique, é um clube alemão multidesportivo sediado na cidade de Munique, no estado da Baviera. O estado e a cidade, que em alemão, respectivamente, se denominam Bayern e München, dão nome ao time.","2",R.drawable.BayernDeMunique));
        lstTimes.add(new Times("RB Leipzig", "RasenBallsport Leipzig e. V. é uma agremiação desportiva alemã, fundada a 19 de maio de 2009, sediada em Leipzig, ligada à multinacional austríaca de bebidas energéticas Red Bull.", "3", R.drawable.RB_Leipzig));
        lstTimes.add(new Times("Borussia Dortmund", "O Ballspielverein Borussia 09 e. V. Dortmund, conhecido como Borussia Dortmund, BVB, ou simplesmente Dortmund, é um clube desportivo alemão sediado em Dortmund, Renânia do Norte-Vestefália. O Dortmund joga na Bundesliga, a primeira divisão do sistema do campeonato alemão de futebol.", "4", R.drawable.Borussia_Dortmund));
        lstTimes.add(new Times("Wolfsburg", "VfL Wolfsburg-Fußball GmbH é uma agremiação esportiva alemã, fundada a 12 de setembro de 1945, e subsidiária da Volkswagen AG, sediada em Wolfsburg, na Baixa Saxônia. O clube abrange 29 departamentos de esportes, sendo o futebol o mais conhecido.", "5", R.drawable.Wolfsburg));
        lstTimes.add(new Times("Union Berlin", "Union Berlin é uma agremiação esportiva alemã, sediada em Berlim, fundada a 20 de janeiro de 1966. Foi uma das duas sociedades que durante a Guerra Fria levaram o nome Union. Enquanto esta atuou na parte leste da cidade, o SC Union 06 Berlin militou na parte oeste.", "6", R.drawable.Union_Berlin));
        lstTimes.add(new Times("VfB Stuttgart", "Verein für Bewegungsspiele Stuttgart 1893 e. V., mais conhecido como VfB Stuttgart ou simplesmente Stuttgart, é uma agremiação esportiva alemã, fundada a 9 de setembro de 1893, sediada em Estugarda, no sudoeste da Alemanha.", "7", R.drawable.VfB_Stuttgart_));
        lstTimes.add(new Times("Monchengladbach", "O Borussia VfL 1900 Mönchengladbach eV, comumente conhecido como Borussia Mönchengladbach, Mönchengladbach ou Gladbach, é um clube de futebol profissional com sede em Mönchengladbach, Renânia do Norte-Vestfália, Alemanha.", "8", R.drawable.Monchengladbach));
        lstTimes.add(new Times("Augsburg","O Fußball-Club Augsburg 1907 e. V., comumente conhecido como FC Augsburg ou simplesmente Augsburg, é um clube de futebol alemão com sede em Augsburg, na Baviera. O FC Augsburg joga na Bundesliga, a primeira divisão do sistema da liga alemã de futebol.","9",R.drawable.Augsburg));
        lstTimes.add(new Times("Eintracht Frankfurt","Eintracht Frankfurt e. V., mais conhecido como Frankfurt, é uma agremiação esportiva alemã fundada em 8 de março de 1899 e sediada na cidade de Frankfurt, no Hesse.","10",R.drawable.Eintracht_Frankfurt));
        lstTimes.add(new Times("Freiburg", "O Sport-Club Freiburg e. V., comumente conhecido como SC Freiburg, é um clube de futebol alemão, com sede na cidade de Freiburg im Breisgau, Baden-Württemberg. Ele joga na Bundesliga, tendo sido promovido como campeão da 2. Bundesliga em 2016.", "11", R.drawable.Freiburg));
        lstTimes.add(new Times("Hertha BSC", "Hertha Berliner Sport-Club é uma agremiação esportiva alemã, fundada a 25 de julho de 1892, sediada em Berlim, capital do país, no distrito de Charlottenburg-Wilmersdorf. O Hertha BSC atua no Estádio Olímpico de Berlim, com capacidade para mais de 80.000 espectadores.", "12", R.drawable.Hertha_BSC));
        lstTimes.add(new Times("Hoffenheim", "Turn- und Sportgemeinschaft 1899 Hoffenheim e. V., mais conhecido apenas como Hoffenheim nos países lusófonos é um clube de futebol alemão situado em Hoffenheim, um subúrbio de Sinsheim, no estado de Baden-Württemberg.", "13", R.drawable.Hoffenheim));
        lstTimes.add(new Times("Werder Bremen", "Sportverein Werder Bremen von 1899 e. V. é uma agremiação esportiva alemã, fundada a 4 de fevereiro de 1899, sediada em Bremen, no norte da Alemanha.", "14", R.drawable.Werder_Bremen));
        lstTimes.add(new Times("Colônia", "FC Köln, em português normalmente Colônia ou Colónia, é uma agremiação desportiva da cidade de Colônia na Renânia do Norte-Vestefália, Alemanha, fundada a 13 de fevereiro de 1948. O clube foi fundado em 13 de fevereiro de 1948 por fusão dos clubes de futebol Köln BC 01 e SpVgg Sülz 07.", "15", R.drawable.Colônia));
        lstTimes.add(new Times("Arminia", "Deutscher Sport-Club Arminia Bielefeld é uma agremiação esportiva alemã, fundada a 3 de maio de 1905, e sediada na cidade de Bielefeld, na Renânia do Norte-Vestfália. A associação, que conta com 11.394 sócios, além do futebol, oferece hóquei em campo, patinação artística e bilhar. Suas cores são preto, branco e azul.", "16", R.drawable.Arminia));
        lstTimes.add(new Times("Mainz05", "Fußball- und Sportverein Mainz 05, ou de forma abreviada Mainz 05, é uma agremiação esportiva alemã, fundada a 16 de março de 1905, sediada em Mogúncia, na Renânia-Palatinado. Participa da Fußball-Bundesliga, a primeira divisão do Campeonato Alemão.", "17", R.drawable.mainz05));
        lstTimes.add(new Times("Schalke04", "Fußball-Club Gelsenkirchen-Schalke 04 é um clube de futebol alemão, sediado na cidade de Gelsenkirchen, no populoso Vale do Ruhr. Fundado em 4 de maio de 1904, o Schalke tornou-se um dos clubes mais populares da Alemanha.", "18", R.drawable.schalke04));
        //declarando a variavel xml enviando para o java
        RecyclerView mRecyclerView = findViewById(R.id.id_recyclerView);

        //Instânciando o adaptador com os valores necessários
        RecyclerViewAdapter mAdapter = new RecyclerViewAdapter(getApplicationContext(), lstTimes);
        //Criando o layout para inserção dos valores

        //LayoutManager não é necessário inserção de colunas - pode ser utilizado na vertical ou horizontal
       // mRecyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext(), RecyclerView.HORIZONTAL,true));

        //GriLayoutManager necessário a inserção de colunas
        mRecyclerView.setLayoutManager(new GridLayoutManager(getApplicationContext(), 3));

        //Para melhorar a performance do RecyclerView na listagem
        mRecyclerView.setHasFixedSize(true);

        //Inserindo os valores na lista do RecyclerView
        mRecyclerView.setAdapter(mAdapter);
    }
}
