package com.guigarage.sdk.toolbar;

import com.guigarage.sdk.util.Callback;
import com.guigarage.sdk.util.Icon;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.css.PseudoClass;
import javafx.scene.control.Button;

/**
 * Created by hendrikebbers on 12.03.15.
 */
public class ApplicationToolbar extends BaseToolbar {

    private Button menuButton;

    public ApplicationToolbar() {
        getStyleClass().add("application-toolbar");

        menuButton = new Button();
        menuButton.setId("application-menu-button");
        menuButton.setText(Icon.NAV.getText());
        menuButton.setOnMouseEntered(e -> {
            menuButton.setScaleX(1.1);
            menuButton.setScaleY(1.1);
        });
        menuButton.setOnMouseExited(e -> {
            menuButton.setScaleX(1.0);
            menuButton.setScaleY(1.0);
        });
        leftNodeProperty().setValue(menuButton);


    }

    public void setMenuButtonVisible(boolean visible) {
        menuButton.setVisible(visible);
    }

    public void setMenuButtonCallback(Callback callback) {
        menuButton.setOnAction(e -> callback.call());
    }

}
