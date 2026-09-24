# DJ2 Integrated Dynamics Optimizations

Targeted performance optimizations for Integrated Dynamics in Divine Journey 2.

## Target environment

- Minecraft 1.12.2
- Forge 14.23.5.2860
- Integrated Dynamics 1.1.11
- Integrated Tunnels 1.6.14
- Cyclops Core 1.6.7
- Common Capabilities 2.4.8
- Integrated NBT 1.2.2
- Integrated Derivative 1.1.2

## Status

Early development.

The first investigation targets the failed-transfer cache used by
`TunnelHelpers.moveSingleStateOptimized`.

The current phase is measurement and verification only. No production
optimization has been enabled yet.