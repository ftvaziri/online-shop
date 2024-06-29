package listPanels;

import Data.Product;

import javax.swing.*;
import java.awt.*;

public class productListCard {
    public Product product;
    public JLabel nameLabel, priceLabel, imageLabel, stockLabel;
    public JPanel cardPanel;
    public productListCard(Product product) {

        this.product = product;
        this.nameLabel = new JLabel(product.getName());
//        nameLabel.setBounds();
        this.priceLabel = new JLabel(String.valueOf(product.getPrice()));
//        priceLabel.setBounds();
        this.imageLabel = new JLabel(product.imageIcon);
//        imageLabel.setBounds();
        this.stockLabel = new JLabel(String.valueOf(product.getStock()));
//        numLabel.setBounds();

        cardPanel.add(imageLabel);
        cardPanel.add(nameLabel);
        cardPanel.add(priceLabel);
        cardPanel.add(stockLabel);

        cardPanel.setPreferredSize(new Dimension(780, 100));

    }
    public Product getProduct() {
        return this.product;
    }
}
