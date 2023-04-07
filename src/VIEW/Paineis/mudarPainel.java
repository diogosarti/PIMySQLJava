package VIEW.paineis;

import javax.swing.JPanel;

public class mudarPainel {
    private JPanel container;
    private JPanel content;

    public mudarPainel(JPanel container, JPanel content) {
        this.container = container;
        this.content = content;
        this.container.removeAll();
        this.container.revalidate();
        this.container.repaint();
        
        this.container.add(this.content);
        this.container.revalidate();
        this.container.repaint();
    }
}
