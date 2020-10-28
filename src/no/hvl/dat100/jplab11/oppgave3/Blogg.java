package no.hvl.dat100.jplab11.oppgave3;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave1.*;

public class Blogg {
	
	private Innlegg[] innleggtabell;
	private int nesteledig;
	
	
	public Blogg() {
//		innleggtabell = new Innlegg [20];
		this(20);
	}

	public Blogg(int lengde) {
		innleggtabell = new Innlegg [lengde];
		nesteledig=0;
		
	}

	public int getAntall() {
		return nesteledig;
	}
	
	public Innlegg[] getSamling() {
		
		return innleggtabell;
	}
		
	public int finnInnlegg(Innlegg innlegg) {
		boolean funnet=false;
		int pos=0;
		while(pos<nesteledig && !funnet)
			if(erLik(Innlegg innlegg))
		
		
		
		
		return pos;
	}

	public boolean finnes(Innlegg innlegg) {
		throw new UnsupportedOperationException(TODO.method());
	}

	public boolean ledigPlass() {
		throw new UnsupportedOperationException(TODO.method());

	}
	
	public boolean leggTil(Innlegg innlegg) {

		throw new UnsupportedOperationException(TODO.method());
	}
	
	public String toString() {
		throw new UnsupportedOperationException(TODO.method());
	}

	// valgfrie oppgaver nedenfor
	
	public void utvid() {
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public boolean leggTilUtvid(Innlegg innlegg) {

		throw new UnsupportedOperationException(TODO.method());
		
	}
	
	public boolean slett(Innlegg innlegg) {
		
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public int[] search(String keyword) {
		
		throw new UnsupportedOperationException(TODO.method());

	}
}