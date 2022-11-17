package ij.gui;

import ij.*;
import java.awt.AWTEvent;

/**
 * PlugIns or PlugInFilters that want to listen to changes in a GenericDialog
 * without adding listeners for each dialog field should implementthis method.
 * The dialogItemChanged method of a PlugIn or PlugInFilter can and should read
 * the various dialog items by the appropriate GenericDialog methods like
 * getNextNumber (items that are not read in the dialogItemChanged method will
 * not be recorded by the Macro recorder).
 *
 * The PlugIn or PlugInFilter has to be added to the GenericDialog by its
 * addDialogListener method: gd.addDialogListener(this);
 *
 */
public interface DialogListener {

    /**
     * This method is invoked by a Generic Dialog if any of the inputs have
     * changed (CANCEL does not trigger it; OK and running the dialog from a
     * macro only trigger the first DialogListener added to a GenericDialog).
     *
     * @param e The event that has been generated by the user action in the
     * dialog. Note that <code>e</code> is <code>null</code> if the
     * dialogItemChanged method is called after the user has pressed the OK
     * button or if the GenericDialog has read its parameters from a macro.
     * @param gd A reference to the GenericDialog.
     * @return Should be true if the dialog input is valid. False disables the
     * OK button and preview (if any).
     */
    boolean dialogItemChanged(GenericDialog gd, AWTEvent e);
}
