/*
 * Copyright (c) 2014 PikaMug and contributors. All rights reserved.
 *
 * THIS SOFTWARE IS PROVIDED "AS IS" AND ANY EXPRESSED OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED
 * TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN
 * NO EVENT SHALL THE REGENTS OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
 * EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS
 * OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY
 * OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

package me.blackvein.quests.dependencies;

import me.blackvein.quests.player.IQuester;
import me.blackvein.quests.Quests;

public class DenizenTrigger {
    private final Quests plugin;
    
    public DenizenTrigger(final Quests plugin) {
        this.plugin = plugin;
    }
    public boolean runDenizenScript(final String scriptName, final IQuester quester) {
        if (scriptName == null) {
            return false;
        }
        if (plugin.getDependencies().getDenizenApi().containsScript(scriptName)) {
            plugin.getDependencies().getDenizenApi().runTaskScript(scriptName, quester.getPlayer());
        }
        return true;
    }
}
