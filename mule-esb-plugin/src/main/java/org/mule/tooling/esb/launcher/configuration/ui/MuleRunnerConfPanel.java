package org.mule.tooling.esb.launcher.configuration.ui;

import org.mule.tooling.esb.sdk.ui.MuleSdkComboSelection;

import javax.swing.*;

public class MuleRunnerConfPanel
{
    private JTextField vmArgsField;
    private JPanel mainPanel;
    //private ModulesComboBox moduleCombo;
    private MuleSdkComboSelection muleSdkSelector;
    private MuleModulesCheckBoxList modulesList;


    public MuleRunnerConfPanel()
    {

    }

    public JPanel getMainPanel()
    {
        return mainPanel;
    }

    public JTextField getVmArgsField()
    {
        return vmArgsField;
    }

    public JComboBox getMuleHome()
    {
        return muleSdkSelector.getMuleSdk();
    }

    public MuleModulesCheckBoxList getModulesList() { return modulesList; }
//    public ModulesComboBox getModuleCombo()
//    {
//        return moduleCombo;
//    }
}
