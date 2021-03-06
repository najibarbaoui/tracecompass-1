/*******************************************************************************
 * Copyright (c) 2016 Movidius Inc. and others
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/

package org.eclipse.tracecompass.tmf.ui.symbols;

import org.eclipse.jdt.annotation.NonNullByDefault;
import org.eclipse.jface.preference.PreferencePage;

/**
 * Abstract implementation of the {@link ISymbolProviderPreferencePage}. Instead
 * of implementing the interface one should extend this class.
 *
 * @author Robert Kiss
 * @since 2.0
 */
@NonNullByDefault
public abstract class AbstractSymbolProviderPreferencePage extends PreferencePage implements ISymbolProviderPreferencePage {

    private final ISymbolProvider fProvider;

    /**
     * Create a new instance that knows how to configure the given provider
     *
     * @param provider
     *            the {@link ISymbolProvider} to configure
     */
    public AbstractSymbolProviderPreferencePage(ISymbolProvider provider) {
        fProvider = provider;
        setTitle(provider.getTrace().getName());
        noDefaultAndApplyButton();
    }

    @Override
    public ISymbolProvider getSymbolProvider() {
        return fProvider;
    }

}
