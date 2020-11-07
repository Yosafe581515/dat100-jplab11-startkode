package no.hvl.dat100.jplab11.oppgave3;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave1.*;

public class Blogg {

	private Innlegg[] innleggtabell;
	private int nesteledig;
	

	public Blogg() {
		this(20);
//		innleggtabell = new Innlegg [20];

	}

	public Blogg(int lengde) {
		innleggtabell = new Innlegg[lengde];
		nesteledig = 0;

	}

	public int getAntall() {
		return nesteledig;
	}

	public Innlegg[] getSamling() {

		return innleggtabell;
	}

	public int finnInnlegg(Innlegg innlegg) {
		boolean funnet = false;
		int pos = 0;
		while (pos < nesteledig && !funnet)
			if (innlegg.getId() == innleggtabell[pos].getId()) {
				funnet = true;
			} else {
				pos++;
			}
		if (funnet) {
			return pos;
		} else {
			return -1;
		}

	}

	public boolean finnes(Innlegg innlegg) {
		int pos=finnInnlegg(innlegg);
		
		if(pos>=0) {
			return true;
		}else {
			return false;
		}
	}

	public boolean ledigPlass() {
		if(nesteledig<innleggtabell.length) {
			return true;
		}else {
			return false;
		}

	}

	public boolean leggTil(Innlegg innlegg) {
		boolean ny = finnInnlegg(innlegg) == -1;
		if(ny && nesteledig < innleggtabell.length) {
			innleggtabell[nesteledig] = innlegg;
			nesteledig++;
			return true;
		}else {
			return false;
		}
	}

	public String toString() {
		String svar=nesteledig+"\n";
		for (int i = 0; i < nesteledig; i++) {
			svar += innleggtabell[i].toString();
		}
		return svar;
	}

	// valgfrie oppgaver nedenfor

	public void utvid() {
		Innlegg [] nyTab;
		nyTab= new Innlegg [2*innleggtabell.length];
		for (int i=0;i<nesteledig;i++) {
			nyTab[i]=innleggtabell[i];
		}
		this.innleggtabell=nyTab;
	}

	public boolean leggTilUtvid(Innlegg innlegg) {
		if(nesteledig < innleggtabell.length) {
			leggTil(innlegg);
		}if (nesteledig >= innleggtabell.length){
			utvid();
			leggTil(innlegg);
		}	
		
		
		return leggTil(innlegg);
	}

	public boolean slett(Innlegg innlegg) {

		int pos = finnInnlegg(innlegg);
		if (pos >= 0) {
			nesteledig--;
			innleggtabell[pos] = innleggtabell[nesteledig];
			innleggtabell[nesteledig] = null;
			return true;
		} else {
			return false;
		}

	}

	public int[] search(String keyword) {

		throw new UnsupportedOperationException(TODO.method());

	}
}