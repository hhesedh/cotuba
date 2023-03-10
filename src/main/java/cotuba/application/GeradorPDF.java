package cotuba.application;

import cotuba.domain.Ebook;
import cotuba.pdf.GeradorPDFComIText;

public interface GeradorPDF {

    void gera(Ebook ebook);

    static GeradorPDF cria() {
        return new GeradorPDFComIText();
    }

}
